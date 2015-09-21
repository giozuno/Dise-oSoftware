package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwimSeatTest {
    @Test
    public void testSwimSeat() {
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm a Swim seat", swimSeat.display());
        assertEquals("I'm deflating!", swimSeat.deflating());
        assertEquals("I'm inflating!", swimSeat.inflating());
        assertEquals("I'm floating!", swimSeat.floating());
    }
}
