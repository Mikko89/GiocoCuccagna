package it.edu.iisvolta;

public class Main {

	public static void main(String[] args) {
		
		Squadra thr1=new Squadra("Carpentieri");
		Squadra thr2=new Squadra("Muratori");
		
	    System.out.println("Partono le squadre. Via!");
	    thr1.start();
	    thr2.start();
	}
}
