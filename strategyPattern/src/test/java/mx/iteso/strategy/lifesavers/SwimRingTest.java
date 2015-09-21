package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimRingTest {
    @Test
    public void testSwimRing() {
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm a Swim ring", swimRing.display());
        assertEquals("I'm deflating!", swimRing.deflating());
        assertEquals("I'm inflating!", swimRing.inflating());
        assertEquals("I'm floating!", swimRing.floating());
    }
}
