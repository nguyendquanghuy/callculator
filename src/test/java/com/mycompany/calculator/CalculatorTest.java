/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calculator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author quang huy
 */
public class CalculatorTest {



    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 3;
        int b = 4;
        Calculator instance = new Calculator();
        int expResult = 7;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of subtract method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testSubtract() {
        System.out.println("subtract");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.subtract(a, b);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testMultiply() {
        System.out.println("multiply");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiply(a, b);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of divide method, of class Calculator.
     */
    @org.junit.jupiter.api.Test
    public void testDivide() {
        System.out.println("divide");
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.divide(a, b);
        assertEquals(expResult, result);
    
    }
    
}
