package com.joselara.tema02_ejercicio03;

public class HebraGet extends Thread{
    VariableCompartida v;
	public HebraGet(VariableCompartida v){
		this.v=v;
	}
	public void run(){
		for (int i=0;i<1000;i++){
			//System.out.println(v.getV()+" ");
		}
			
	}
}
