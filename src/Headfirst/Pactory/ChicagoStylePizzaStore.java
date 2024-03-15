package Headfirst.Pactory;

public class ChicagoStylePizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new ChicagoIngredientFactory();

        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("시카고 스타일 치즈 피자");
        } else if(type.equals("veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("시카고 스타일 야채 피자");
        }
        else if(type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("시카고 스타일 조개 피자");
        }
        return pizza;
    }

//    @Override
//    Pizza createPizza(String type) {
//        if(type.equals("cheese")){
//            return new ChicagoPizza();
//        }else if(type.equals("veggie")){
//            return new ChicagoPizza1();
//        }else if(type.equals("clam")){
//            return new ChicagoPizza1();
//        }else return null;
//    }
}
