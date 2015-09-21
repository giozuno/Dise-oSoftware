package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.*;
import mx.iteso.strategy.behaviors.impl.Floatable;

/**
 * Created by giovanni on 18/09/2015.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts(){
        type = "Swim belts";
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new Floatable();
    }
}
