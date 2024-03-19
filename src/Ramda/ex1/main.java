package Ramda.ex1;

public class main {
    public static void main(String[] args) {

        FunctionInterA a = () -> System.out.println("A");
        a.apply();

        InterB b = () -> System.out.println("B");
        b.apply();

        a.apply2();
    }


}
