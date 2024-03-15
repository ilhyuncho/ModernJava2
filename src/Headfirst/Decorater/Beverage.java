package Headfirst.Decorater;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    String description = "제목 없음";
    Size size = Size.TALL;

    public String getDescription() {
        return description;
    }

    public abstract  double cost();

    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return size;
    }
}
