package Coding.String;


// 문자열을 int, long, float, doble 로 변환

public class ex7 {

    private static final String str = "4";

    public static void main(String[] args) {

        test1();
    }

    public static String test1(){
        String result="";

        Integer integer = Integer.valueOf(str);
        int i = Integer.parseInt(str);


        return result;
    }


}
