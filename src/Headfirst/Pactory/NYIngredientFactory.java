package Headfirst.Pactory;

import javax.xml.transform.Source;

public class NYIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSource() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggxianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
//        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
//        return veggies;
        return null;
    }
}
