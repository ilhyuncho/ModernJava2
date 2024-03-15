package Headfirst.Pactory;

public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("준비중!!" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSource();
        cheese = ingredientFactory.createCheese();
    }
}
