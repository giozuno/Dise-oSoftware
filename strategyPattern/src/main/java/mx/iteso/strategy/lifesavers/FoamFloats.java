package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

/**
 * Created by giovanni on 18/09/2015.
 */
public class FoamFloats extends Lifesaver{
    public FoamFloats() {
        type = "Foam floats";
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new Floatable();
    }
}
