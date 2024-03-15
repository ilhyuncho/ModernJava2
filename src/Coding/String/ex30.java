package Coding.String;

// 부호 없는 값의 나눗셈과 나머지
public class ex30 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        // 부호 있을때
        int divi = Integer.MIN_VALUE / Integer.MAX_VALUE;
        System.out.println(divi);   // -1

        int i = Integer.divideUnsigned(Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.println(i);      // 1


        return result;
    }


}
