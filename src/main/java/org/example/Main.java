package org.example;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(6, 4));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}