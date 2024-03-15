package Coding.String;

// long 을 int로 변환
public class ex34 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        long nr = Integer.MAX_VALUE;
        int i = (int)nr;

        System.out.println(i);  // 2147483647
        // or
        int i2 = Long.valueOf(nr).intValue();
        System.out.println(i2);  // 2147483647

        //그러나
        long nr1 = Long.MAX_VALUE;
        int i3 = (int)nr1;

        System.out.println(i3);  // -1

        // JDK8 의 Math.toIntExact()
        int intExact = Math.toIntExact(nr1);
        System.out.println(intExact);   // 예외 발생


        return result;
    }


}
