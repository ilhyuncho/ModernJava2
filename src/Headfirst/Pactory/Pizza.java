package Headfirst.Pactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    //List<String> toppings = new ArrayList<>();

    abstract void prepare();        // 필요한 재료를 가져옴
//    public  void prepare(){
//        System.out.println("준비중:" + name);
//        toppings.forEach(System.out::println);
//    }
    public  void bake(){
        System.out.println("174도");
    }
    public  void cut(){
        System.out.println("담기~~!!");
    }
    public  void box(){
        System.out.println("담기");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "fsdf";
    }
}
