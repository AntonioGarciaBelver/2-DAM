
package com.joselara.tema02_ejercicio02;

public class Hebra implements Runnable {
    	VariableCompartida v;
	public Hebra(VariableCompartida v){
		this.v=v;
	}
        @Override
	public void run(){
		for (int i=0;i<100000;i++){
			v.incV();
		}
			
	}
}
