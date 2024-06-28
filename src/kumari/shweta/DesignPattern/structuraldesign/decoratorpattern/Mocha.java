package kumari.shweta.DesignPattern.structuraldesign.decoratorpattern;
//addon class
public class Mocha implements Bevarage {
   Bevarage bevarage;

           Mocha(Bevarage bevarage) {
          this.bevarage = bevarage;
           }


    @Override
    public double getCost() {
        return 25.0+bevarage.getCost();
    }
}
