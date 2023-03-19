package com.joselara.tema02_ejercicio02;

public class VariableCompartida {
	private int v;

	public VariableCompartida(int v){
		this.v=v;
	}
	
	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
	public synchronized void incV(){
		v++;
	}
}

