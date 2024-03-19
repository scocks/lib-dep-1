package org.king.libdep1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {    
    @Test
    void testGreet() {
        Library library = new Library();
        String result = library.greet("lib-dep-1");
        assertEquals("greet from libdep1, lib-dep-1!", result);
    }
}
