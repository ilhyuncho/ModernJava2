package Coding.String;

import java.math.BigInteger;

// BigInteger를 원시 타입으로 변환
public class ex33 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        // BigInteger 클래스는 불변 임이 정밀도 정수를 표현 함
        // BigInteger를 byte나, long, double같은 원시 타입으로 변환해주는 메서드가 포함됨

        BigInteger nr = BigInteger.valueOf(Long.MAX_VALUE);
        long nrLong = nr.longValue();

        System.out.println(nrLong); // 9223372036854775807 으로 정상 출력

        // 그러나 값이 작은 int에 넣ㅇ면
        int nrint = nr.intValue();  // -1 비정상 출력
        System.out.println(nrint);

        // 하자미나 JDK8 부터 새 메서드 추가
        long l = nr.longValueExact();
        int i = nr.intValueExact();

        System.out.println(l);  // 정상
        System.out.println(i);  // ArithmeticException을 던짐

        return result;
    }


}
