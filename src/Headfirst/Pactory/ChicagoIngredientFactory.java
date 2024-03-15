package Headfirst.Pactory;

public class ChicagoIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSource() {
        return new FlumSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
//        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
//        return veggies;
        return null;
    }
}
