package mx.iteso.strategy.lifesavers;

import mx.iteso.strategy.Lifesaver;
import mx.iteso.strategy.behaviors.impl.NotFloatable;
import mx.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by giovanni on 18/09/2015.
 */
public class LifesaversCandies extends Lifesaver {
    public LifesaversCandies(){
        type = "Lifesavers candies";
        deflateBehavior = new NotDeflatable();
        flotationCapacity = new NotFloatable();
    }
}
