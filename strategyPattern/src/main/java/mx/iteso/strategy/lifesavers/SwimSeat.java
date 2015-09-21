package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        type = "Swim seat";
        deflateBehavior = new Deflatable();
        flotationCapacity = new Floatable();
    }
}
