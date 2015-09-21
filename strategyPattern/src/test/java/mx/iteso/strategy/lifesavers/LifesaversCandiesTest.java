package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifesaversCandiesTest {
    @Test
    public void testLifesaversCandies() {
        LifesaversCandies lifesaversCandies = new LifesaversCandies();
        assertEquals("I'm a Lifesavers candies", lifesaversCandies.display());
        assertEquals("I can't deflate!", lifesaversCandies.deflating());
        assertEquals("I can't inflate!", lifesaversCandies.inflating());
        assertEquals("I can't float!", lifesaversCandies.floating());
    }
}
