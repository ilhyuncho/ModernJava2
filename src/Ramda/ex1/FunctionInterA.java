package Ramda.ex1;

@FunctionalInterface
public interface FunctionInterA {
    void apply();

    default  void apply2(){
        System.out.println("gdfgdfgdfg");
    }
}
