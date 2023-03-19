
package com.joselara.tema02_ejercicio02_sync;

public class Hebra extends Thread {
    	VariableCompartida v;
	public Hebra(VariableCompartida v){
		this.v=v;
	}
        @Override
	public void run(){
		for (int i=0;i<10000;i++){
			v.incV();
		}
			
	}
}
