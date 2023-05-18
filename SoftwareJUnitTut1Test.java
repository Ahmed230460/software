package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoftwareJUnitTut1Test {
    SoftwareJUnitTut1 s = new SoftwareJUnitTut1();

    @Test
    void removeAFromFirstTwoChar_v1() {
        assertEquals("CD", s.removeAFromFirstTwoChar("AACD"));
        assertEquals("BCDEDF", s.removeAFromFirstTwoChar("ABCDEDF"));
        // ..
    }

    @Test
    void removeAFromFirstTwoChar_v2() {
        assertEquals("", s.removeAFromFirstTwoChar("A"));
        assertEquals("B", s.removeAFromFirstTwoChar("B"));
        assertEquals("CC", s.removeAFromFirstTwoChar("CC"));
        // ..
    }


    @Test
    void isSameFirstSameLast_v1(){
        assertTrue(s.isSameFirstSameLast("AABCAA"));
        assertTrue( s.isSameFirstSameLast("AB"));
    }

    @Test
    void isSameFirstSameLast_v2(){
        assertFalse( s.isSameFirstSameLast("A"));
        assertFalse( s.isSameFirstSameLast("AABCAV"));
    }


}