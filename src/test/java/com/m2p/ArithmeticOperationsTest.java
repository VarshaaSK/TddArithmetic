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

    @Test
    void toReturnSixOnSubtractingFourFromTen(){

        int expectedValue = 6;
        int actualValue = arithmeticOperations.subtract(10,4);

        assertEquals(expectedValue , actualValue);
    }

    @Test
    void toReturnMinusSixOnSubtractingTenFromFour(){

        int expectedValue = -6;
        int actualValue = arithmeticOperations.subtract(4,10);

        assertEquals(expectedValue , actualValue);
    }


}
