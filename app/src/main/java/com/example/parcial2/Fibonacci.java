package com.example.parcial2;

public class Fibonacci {
    private int fiboACalcular;

    Fibonacci(int a){
        fiboACalcular = a;
    }

    public int getFibonacci(){
        return calcularFibonacci(fiboACalcular);
    }

    private int calcularFibonacci(int a) {
        if(a==1)
            return 0;

        if(a==2)
            return 1;

        return calcularFibonacci(a-1) + calcularFibonacci(a-2);
    }
}
