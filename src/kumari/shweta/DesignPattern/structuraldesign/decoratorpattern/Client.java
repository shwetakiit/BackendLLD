package kumari.shweta.DesignPattern.structuraldesign.decoratorpattern;

import java.net.StandardSocketOptions;

public class Client {

    public static void main(String[] args) {

        //Prepare base object
        Bevarage bevarage= new Decaf();

        //Add addition double Mocha on this bevarage
         bevarage = new Mocha(bevarage);
         bevarage = new Mocha(bevarage);
         //Add whip on top of that .
         bevarage = new Whip(bevarage);

        //Total cost should be cost of Beverage+2*cost of Mocha+ whip
        //90+(2*25)+20 -->160
        System.out.println("Total cost of coffe is "+bevarage.getCost());

    }
}
