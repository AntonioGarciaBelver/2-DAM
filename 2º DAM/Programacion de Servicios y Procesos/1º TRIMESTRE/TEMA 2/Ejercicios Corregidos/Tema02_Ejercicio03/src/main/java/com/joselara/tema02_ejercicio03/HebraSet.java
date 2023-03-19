package com.joselara.tema02_ejercicio03;

public class HebraSet extends Thread{
    VariableCompartida v;
	public HebraSet(VariableCompartida v){
		this.v=v;
	}
	public void run(){
		for (int i=0;i<1000;i++){
                    System.out.println("Valor: "+i);
			v.setV(i);
		}
			
	}
}
