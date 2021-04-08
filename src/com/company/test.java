package com.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class test{
    @Test
    void testMutipleImpByLoop() {

        MultipleImpByLoop multipleImpByLoop = new MultipleImpByLoop();
        assertEquals(12, multipleImpByLoop.implement(3,4));
        assertEquals(20, multipleImpByLoop.implement(4,5));
    }

    @Test
    void testMutipleImpRecursive() {

        MultipleImpRecursive multipleImpRecursive = new MultipleImpRecursive();
        assertEquals(12, multipleImpRecursive.implement(3,4));
        assertEquals(20, multipleImpRecursive.implement(4,5));
    }

    @Test
    void testPowerImpByLoopAndMultiplyByLoop() {

        PowerByLoop powerByLoop = new PowerByLoop(new MultipleImpByLoop());
        assertEquals(16, powerByLoop.implement(2,4));
        assertEquals(1, powerByLoop.implement(1,5));
    }

    @Test
    void testPowerImpByLoopAndMultiplyByRecursion() {

        PowerByLoop powerByLoop = new PowerByLoop(new MultipleImpRecursive());
        assertEquals(16, powerByLoop.implement(2,4));
        assertEquals(1, powerByLoop.implement(1,5));
    }

    @Test
    void testPowerImpByRecursionAndMultiplyByLoop() {

        PowerByRecursion powerByRecursion = new PowerByRecursion(new MultipleImpByLoop());
        assertEquals(16, powerByRecursion.implement(2,4));
        assertEquals(1, powerByRecursion.implement(1,5));
    }

    @Test
    void testPowerImpByRecursionAndMultiplyByRecursion() {

        PowerByRecursion powerByRecursion = new PowerByRecursion(new MultipleImpRecursive());
        assertEquals(16, powerByRecursion.implement(2,4));
        assertEquals(1, powerByRecursion.implement(1,5));
    }

    @Test
    void testPowerOperation() {

        PowerOpr power1 = new PowerOpr(new PowerByRecursion(new MultipleImpRecursive()));
        assertEquals(16, power1.operate(2,4));
        assertEquals(1, power1.operate(1,5));
    }
}