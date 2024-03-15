package Headfirst.Pactory;

import javax.xml.transform.Source;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSource();
    public Cheese createCheese();
    public Veggies[] createVeggies();

}
