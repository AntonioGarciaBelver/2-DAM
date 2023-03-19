package com.joselara.tema02_ejercicio03;

public class Test {
    public static void main(String[] args) throws InterruptedException {
		VariableCompartida v = new VariableCompartida(0);
		HebraSet h1 = new HebraSet(v);
		HebraGet h2 = new HebraGet(v);
		h1.start();
		h2.start();
			h1.yield();
			h2.yield();
                h1.join();
                h2.join();
		System.out.println();
		System.out.println("Valor de v="+v.getV());

	}
}
