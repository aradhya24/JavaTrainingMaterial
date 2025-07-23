package com.aurionpro.calculator;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    Calculator calculator;
    
    @BeforeEach
    void setUp() {
    	calculator = new Calculator();
    }
    
    @DisplayName("Prime number checker")
    @ParameterizedTest(name = "{0} is prime")
    @ValueSource(ints = {5,7,11})
    void isPrimeTest(int number) {
    	assertTrue(calculator.isPrime(number), number+" should   be prime");
    }
    
    @DisplayName("Non Prime number checker")
    @ParameterizedTest(name = "{0} is not prime")
    @ValueSource(ints = {4,6,8})
    void isNonPrimeTest(int number) {
    	assertFalse(calculator.isPrime(number), number+" should  Not be prime");
    }
}
