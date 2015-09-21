package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LifeVestTest {
    @Test
    public void testLifeVest() {
        LifeVest lifeVest = new LifeVest();
        assertEquals("I'm a Life vest", lifeVest.display());
        assertEquals("I can't deflate!", lifeVest.deflating());
        assertEquals("I can't inflate!", lifeVest.inflating());
        assertEquals("I'm floating!", lifeVest.floating());
    }
}
