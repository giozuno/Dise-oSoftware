package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloatTest {
    @Test
    public void testFloatableFloat() {
        Floatable floatable = new Floatable();
        assertEquals("I'm floating!", floatable.Float());
    }

    @Test
    public void testNotFloatableFloat() {
        NotFloatable notFloatable = new NotFloatable();
        assertEquals("I can't float!", notFloatable.Float());
    }
}
