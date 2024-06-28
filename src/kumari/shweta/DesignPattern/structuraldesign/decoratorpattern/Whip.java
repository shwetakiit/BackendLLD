package kumari.shweta.DesignPattern.structuraldesign.decoratorpattern;

public class Whip implements  Bevarage{
Bevarage bevarage;
        Whip(Bevarage bevarage){
    this.bevarage = bevarage;
        }

    @Override
    public double getCost() {
        return 20.0+bevarage.getCost();
    }
}
