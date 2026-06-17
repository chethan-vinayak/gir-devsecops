package com.girtechnologies;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest
{
    @Test
    public void testGreet()
    {
        App app = new App();
        assertEquals("Hello, GIR Intern!", app.greet("GIR Intern"));
    }

    @Test
    public void testAdd()
    {
        App app = new App();
        assertEquals(6, app.add(2, 3));
    }

    @Test
    public void testAddNegative()
    {
        App app = new App();
        assertEquals(-1, app.add(2, -3));
    }
}
