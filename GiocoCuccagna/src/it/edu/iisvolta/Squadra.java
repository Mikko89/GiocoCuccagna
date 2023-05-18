package it.edu.iisvolta;

import java.util.Random;

public class Squadra extends Thread{

	static boolean arrivato=false;
	private String nome;
	private int metriSalita;
	private int salitaAlbero;
	private int pausa;
	private int[] scivolone= {12, 15, 19, 23, 27, 31, 34, 38, 41, 42, 45, 49};
	
	public Squadra(String nome) {
		this.nome=nome;
		System.out.println("\nLa squadra " +nome +" è pronta!");
	}
	
	public void run() {
		while(this.arrivato==false) {
			Random r=new Random();
            metriSalita=r.nextInt(5)+1;
            salitaAlbero+=metriSalita;
            System.out.println("La squadra " +nome +" sale di " +metriSalita +" mt e arriva a " +salitaAlbero +" mt");
            for(int i=0;i<12;i++) {
                if(salitaAlbero==scivolone[i]) {
                	salitaAlbero-=5;
                	System.out.println("Ma scivola di 5 , scendendo a " +metriSalita +" mt!");
                }
                }
                if(salitaAlbero<50)
                {
                	try{Thread.sleep(1000);}
                    catch(InterruptedException e){}
                }
                else
                {           
                    this.arrivato=true;
                    System.out.println("La squadra " +nome +" è arrivata alla cuccagna!");
                    this.stop();
                }
                this.yield();
		}
	}
}
