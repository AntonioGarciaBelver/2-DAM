package com.mycompany.programacionmultihilo;


import java.util.concurrent.atomic.AtomicInteger;


public class Caso_3Solucionado {
    public static void main(String[] args) {
        VariableCompartida vc = new VariableCompartida();
        AtomicInteger num = new AtomicInteger();
        ThreadGet tg1 = new ThreadGet(vc, num);
        ThreadSet ts1 = new ThreadSet(vc, num);
        tg1.start();
        ts1.start();
    }
    public static class VariableCompartida {
        int v = 0;
        public int getV() {
            return v;
        }
        public void setV(int v) {
            this.v = v;
        }
        public void inc() {
            v++;
        }
    }
    public static class ThreadGet extends Thread {
        VariableCompartida vc;
        AtomicInteger num;
        public ThreadGet(VariableCompartida v, AtomicInteger n) {
            vc = v;
            num = n;
        }
        public void run() {
            boolean ejecutandose = true;
            int contador = 0;
            while (ejecutandose) {
                if (num.get()==0) {
                    if (contador == 99) {
                        ejecutandose=false;
                    }
                    System.out.println(vc.getV());
                    num.set(1);
                    contador++;
                }
            }
        }
    }
    public static class ThreadSet extends Thread {
        VariableCompartida vc;
        AtomicInteger num;
        public ThreadSet(VariableCompartida v, AtomicInteger n) {
            vc = v;
            num = n;
        }
        public void run() {
            boolean ejecutandose = true;
            int contador = 1;
            while (ejecutandose) {
                if (num.get()==1) {
                    if (contador == 99) {
                        ejecutandose=false;
                    }
                    vc.setV(contador);
                    num.set(0);
                    contador++;
                }
            }
        }
    }
}
