package Headfirst.Pactory;

public class PizzaMain {
    public static void main(String[] args) {

        PizzaStore store1 = new NYStylePizzaStore();
        Pizza pizza1 = store1.orderPizza("cheese");

        PizzaStore store2 = new ChicagoStylePizzaStore();
        Pizza pizza2 = store2.orderPizza("cheese");

        pizza1.getName();
        pizza2.getName();



    }
}
