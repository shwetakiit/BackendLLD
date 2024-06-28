package kumari.shweta.DesignPattern.structuraldesign.decoratorpattern;
//Base class
public class Espresso implements  Bevarage{

    @Override
    public double getCost() {
        return 100.0;
    }
}
