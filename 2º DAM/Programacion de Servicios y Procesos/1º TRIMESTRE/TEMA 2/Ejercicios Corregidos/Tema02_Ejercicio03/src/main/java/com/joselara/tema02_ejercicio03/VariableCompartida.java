package com.joselara.tema02_ejercicio03;

public class VariableCompartida {
	private int v;

	public VariableCompartida(int v){
		this.v=v;
	}
	
	public synchronized int getV() {
		return v;
	}

	public synchronized void setV(int v) {
		this.v = v;
	}
	
	public synchronized void incV(){
		v++;
	}
}

