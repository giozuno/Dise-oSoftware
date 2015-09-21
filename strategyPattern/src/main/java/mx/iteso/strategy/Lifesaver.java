package mx.iteso.strategy;

import mx.iteso.strategy.behaviors.DeflateBehavior;
import mx.iteso.strategy.behaviors.FlotationCapacity;

public class Lifesaver {

    public DeflateBehavior deflateBehavior;
    public FlotationCapacity flotationCapacity;
    public String type;

    public String inflating() {
       return deflateBehavior.inflate();
    }
    public String deflating() {
        return deflateBehavior.deflate();
    }
    public String floating() { return flotationCapacity.Float(); }
    public String display() {
        return "I'm a " + type;
    }
}
