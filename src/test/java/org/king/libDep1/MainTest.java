package org.king.libdep1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void testCount() {
        Library library = new Library();
        String[] result = library.count(10);
        assertEquals(10, result.length);
        for (int i = 0; i < 10; i++) {
            assertEquals("count from libdep1: i = " + i, result[i]);
        }
    }
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-1");
        assertEquals("greet from libdep1, lib-dep-1!", result);
    }
}
