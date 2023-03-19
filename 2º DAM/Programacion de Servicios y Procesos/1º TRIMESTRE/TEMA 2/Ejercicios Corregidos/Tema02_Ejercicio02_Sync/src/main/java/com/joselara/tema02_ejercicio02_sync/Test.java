package com.joselara.tema02_ejercicio02_sync;

public class Test {
    	public static void main(String[] args) {
		VariableCompartida v = new VariableCompartida(0);
		Hebra h1 = new Hebra(v);
		Hebra h2 = new Hebra(v);
                v.setV(0);
		h1.start();
		h2.start();
		try {
			h1.join();
			h2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Valor de v="+v.getV());

	}
}
