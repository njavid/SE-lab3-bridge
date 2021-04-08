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
}