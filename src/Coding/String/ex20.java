package Coding.String;

import java.util.Collections;
import java.util.stream.Collectors;

// 같은 문자열 n번 이어 붙이기
public class ex20 {

    private static final String str = "sdfsdf";

    public static void main(String[] args) {

        String result = test2(4);
        System.out.println(result);
    }

    public static String test2(int count){
        String result = String.join("", Collections.nCopies(count, str));
        return result;
    }
    public static String test1(int count){
        String result="";

        String repeat = str.repeat(count);

        System.out.println(repeat);


        return result;
    }


}
