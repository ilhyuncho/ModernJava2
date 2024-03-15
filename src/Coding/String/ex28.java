package Coding.String;

// 부호 없는 수로 변환
public class ex28 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        // Integer.MIN_VALUE = -2147483648
        long result1 = Integer.toUnsignedLong(Integer.MIN_VALUE);

        System.out.println(result1);    // 2147483648

        //Short.MIN_VALUE = -32768
        int result2 = Short.toUnsignedInt(Short.MIN_VALUE);
        System.out.println(result2);    // 32768

        return result;
    }


}
