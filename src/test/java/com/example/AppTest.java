package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        int result = app.add(5, 10);
        
        // This checks if 5 + 10 actually equals 15
        assertEquals("5 + 10 should be 15", 15, result);
    }
}
