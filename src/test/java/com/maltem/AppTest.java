package com.maltem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void compute() {

        assertEquals(2, Integer.parseInt(App.compute("1+1")));
        assertEquals(2, Integer.parseInt(App.compute("4-2")));
    }
}
