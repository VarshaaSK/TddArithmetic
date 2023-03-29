package com.m2p;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticOperationsTest {
    ArithmeticOperations arithmeticOperations = new ArithmeticOperations();

    @Test
    void toReturnFourOnAddingTwoWithTwo(){

        //Arrange
        int expectedValue = 4;

        //Action
        int actualValue = arithmeticOperations.add(2,2);

        //Assert
        assertEquals(expectedValue , actualValue);
    }
}
