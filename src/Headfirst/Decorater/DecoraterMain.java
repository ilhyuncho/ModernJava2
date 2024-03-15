package Headfirst.Decorater;

import java.io.BufferedInputStream;
import java.util.zip.ZipInputStream;

public class DecoraterMain {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        //Beverage beverage1 =;
       // beverage1.setSize(Beverage.Size.TALL);
        Beverage beverage1 = new Mocha( new HouseBlend());
        beverage1 = new Whip(beverage1);

        System.out.println(beverage1.getDescription() + beverage1.cost());


    }
}
