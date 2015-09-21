package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

public class SwimRing extends Lifesaver{
    public SwimRing() {
        type = "Swim ring";
        deflateBehavior = new Deflatable();
        flotationCapacity = new Floatable();
    }
}
