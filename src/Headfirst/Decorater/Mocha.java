package Headfirst.Decorater;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public double cost() {
        double subPrice;
        if(Size.TALL == beverage.getSize()){
            subPrice = .20;
        }
        else if(Size.VENTI == beverage.getSize()){
            subPrice = .30;
        }
        else {
            subPrice = .40;
        }
        return beverage.cost() + subPrice;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
