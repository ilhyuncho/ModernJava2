package Coding.String;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

// 주어진 문자 제거
public class ex13 {

    private static final String str = "fsdfad[]]]sfsdfaaaa";

    public static void main(String[] args) {

        String result = test3(']');

        System.out.println(result);
    }
    public static String test3(char c){

        return str.chars().filter(ch-> ch != c).mapToObj(c1-> String.valueOf((char)c1)).collect(Collectors.joining());

    }
    public static String test2(char c){
        StringBuilder sb = new StringBuilder();

        for (char cc : str.toCharArray()) {
            if( c != cc ){
                sb.append(cc);
            }
        }
        return sb.toString();
    }

    public static String test1(char c){
        String result="";

        result = str.replaceAll(Pattern.quote(String.valueOf(c)), "");

        return result;
    }


}
