package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimBeltsTest {
    @Test
    public void testSwimBelts() {
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I'm a Swim belts", swimBelts.display());
        assertEquals("I can't deflate!", swimBelts.deflating());
        assertEquals("I can't inflate!", swimBelts.inflating());
        assertEquals("I'm floating!", swimBelts.floating());
    }
}
