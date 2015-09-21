package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

/**
 * Created by giovanni on 18/09/2015.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes() {
        type = "Water tubes";
        deflateBehavior = new Deflatable();
        flotationCapacity = new Floatable();
    }
}
