package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FoamFloatsTest {
    @Test
    public void testFoamFloats() {
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm a Foam floats", foamFloats.display());
        assertEquals("I can't deflate!", foamFloats.deflating());
        assertEquals("I can't inflate!", foamFloats.inflating());
        assertEquals("I'm floating!", foamFloats.floating());
    }
}
