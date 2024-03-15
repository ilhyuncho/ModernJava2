package Coding.String;


// 문자열에서 여백 제거
public class ex8 {

    private static final String str = "  0003438    " +
            "8434  ";

    public static void main(String[] args) {

        test1();
    }

    public static String test1(){
        String result="";

        System.out.println(str.replaceAll("\\s", ""));

        return result;
    }


}
