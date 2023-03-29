package com.m2p;

public class ArithmeticOperations {
    public int add(int firstInputNumber, int secondInputNumber) {
        return firstInputNumber + secondInputNumber;
    }

    public int subtract(int firstInputNumber, int secondInputNumber) {
        return firstInputNumber - secondInputNumber;
    }

    public int multiplication(int firstInputNumber, int secondInputNumber) {
        return firstInputNumber * secondInputNumber;
    }


    public int divide(int firstInputNumber, int secondInputNumber) {
        if(secondInputNumber == 0){
            throw new ArithmeticException();
        }
        return firstInputNumber/secondInputNumber;
    }

}
