package com.joselara.tema02_ejercicio04;

public class Fibonacci extends Thread {
        
    private int n; // el termino de fibonacci que calculas
    
    private int fibn,fibn_1; // el valor de fibonacci de n y de n-1
    
    
    public Fibonacci (int n){
        this.n = n;
    }
    
    
    public void run(){
        if (n <= 2){ // se supone que te llaman como mínimo con n = 1
            fibn=1;
            fibn_1=1;
            System.out.println("Fibonacci "+n+": "+fibn);
        } else {
            Fibonacci hebra = new Fibonacci(n-1);
            hebra.start();
            while(hebra.isAlive());
            fibn_1 = hebra.fibn();
            fibn = hebra.fibn() + hebra.fibn_1();
            System.out.println("Fibonacci "+n+": "+fibn);
        }
    }
    
    public int fibn(){
        return fibn;
    }
    public int fibn_1(){
        return fibn_1;
    }
    
    
    public static void main(String[] args){
        int n = 10;
        Fibonacci fib = new Fibonacci(n);
        fib.start();
        while(fib.isAlive());
        System.out.println("**************");
        System.out.println("FIBONACCI "+n+": "+fib.fibn());
    }
}
