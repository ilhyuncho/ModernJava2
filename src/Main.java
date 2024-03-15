import Headfirst.Observer.CurrentConditionDisply;
import Headfirst.Observer.WeatherData;

import javax.swing.*;
import javax.swing.text.html.Option;
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {





//        Trader raoul = new Trader("Roaul", "Cambridge");
//        Trader mario = new Trader("Mario", "Milan");
//        Trader alan = new Trader("Alan", "Cambridge");
//        Trader brian = new Trader("Brian", "Cambridge");
//
//        List<Transaction> transactions = Arrays.asList(
//                new Transaction(brian, 2011, 300),
//                new Transaction(raoul, 2012, 1000),
//                new Transaction(raoul, 2011, 400),
//                new Transaction(mario, 2011, 710),
//                new Transaction(mario, 2011, 700),
//                new Transaction(alan, 2011, 950)
//        );

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.MEAT),
                new Dish("french", false, 530, Dish.Type.OTHER),
                new Dish("rice", true, 350, Dish.Type.OTHER),
                new Dish("season", false, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );



        Map<String, Dish> collect = menu.stream().collect(Collectors.toMap(Dish::getName, a -> a));
        collect.forEach((a,b) -> System.out.println("a:" + a + "b:"  + b));


    }

}