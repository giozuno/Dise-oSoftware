package mx.iteso.strategy.lifesavers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArmBandsTest {
    @Test
    public void testArmBands() {
        ArmBands armBands = new ArmBands();
        assertEquals("I'm a Arm bands", armBands.display());
        assertEquals("I'm deflating!", armBands.deflating());
        assertEquals("I'm inflating!", armBands.inflating());
        assertEquals("I'm floating!", armBands.floating());
    }
}
