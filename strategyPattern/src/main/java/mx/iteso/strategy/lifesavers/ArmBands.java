package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class ArmBands extends Lifesaver{
    public ArmBands() {
        type = "Arm bands";
        deflateBehavior = new Deflatable();
        flotationCapacity = new Floatable();
    }
}
