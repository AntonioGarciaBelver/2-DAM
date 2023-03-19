package com.joselara.tema02_ejercicio02;

public class Test {
    	public static void main(String[] args) {
		VariableCompartida v = new VariableCompartida(0);
		Hebra h1 = new Hebra(v);
		Hebra h2 = new Hebra(v);
                v.setV(0);
                System.out.println("Empiezo!!!!");
		Thread t1=new Thread(h1);
                t1.start();
		Thread t2=new Thread(h2);
                t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Valor de v="+v.getV());

	}
}
