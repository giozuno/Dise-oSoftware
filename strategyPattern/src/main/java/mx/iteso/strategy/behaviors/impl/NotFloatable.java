package mx.iteso.strategy.behaviors.impl;

import mx.iteso.strategy.behaviors.FlotationCapacity;

/**
 * Created by giovanni on 18/09/2015.
 */
public class NotFloatable implements FlotationCapacity {
    public String Float() {
        return "I can't float!";
    }
}
