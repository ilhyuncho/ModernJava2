package Coding.String;


// 문자 빈도수 세기
public class ex6 {

    private static final String str = "dfgdfhgfwerwer";

    public static void main(String[] args) {

        System.out.println(test1('g'));
    }

    public static int test1(char ch){
        String result="";

        String replace = str.replace(String.valueOf(ch), "");

        int diff = str.length() - replace.length();
        return diff;
    }


}
