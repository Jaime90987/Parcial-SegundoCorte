package com.example.parcial2;

import static org.junit.Assert.*;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class FibonacciTest extends TestCase {

    Fibonacci fibo1 = new Fibonacci(1);
    Fibonacci fibo2 = new Fibonacci(6);
    Fibonacci fibo3 = new Fibonacci(10);

    @Test
    public void test1()  {
        assertEquals(0, fibo1.getFibonacci());
    }

    @Test
    public void test2()  {
        assertEquals(5, fibo2.getFibonacci());
    }

    @Test
    public void test3()  {
        assertEquals(34, fibo3.getFibonacci());
    }

}