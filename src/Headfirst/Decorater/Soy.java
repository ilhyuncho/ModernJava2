package Headfirst.Decorater;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        return beverage.cost() + .30;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
