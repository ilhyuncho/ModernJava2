package Coding.String;

import java.util.function.BinaryOperator;

// 두 큰 int/long 수의 합과 연산 오버플로
public class ex26 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        int x = Integer.MAX_VALUE;  // 2,147,483,647
        int y = Integer.MAX_VALUE;

        int z = x + y;  // -2

        // long 타입으로 바꾸면
        long x1 = Integer.MAX_VALUE;  // 2,147,483,647
        long y1 = Integer.MAX_VALUE;

        long z1 = x1 + y1;  // 4294967294 으로 정상 출력

        // JDK8부터 Math클래스에 두개의 addExact() 메서드가 추가 됨
        //int z2 = Math.addExact(x,y);    // ArithmeticException 을 던진다.

        BinaryOperator<Integer> operator = Math::addExact;
        int z3 = operator.apply(x, y);  // ArithmeticException 을 던진다.

        System.out.println(z3);
        return result;
    }


}
