package Coding.String;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 두 문자열이 애너그램인지 검사
// 같은 문자들을 서로 다른 순서로 포함하는 두 문자열을 애너그램 이라 부른다
public class ex18 {

    private static final String str = "Hel  lo";
    private static final String str1 = "hll  Oe";

    public static void main(String[] args) {

        boolean result = test1();
        System.out.println(result);
    }

    public static boolean test1(){
        String result="";

        String lowerCase1 = str.replaceAll("\\s", "").toLowerCase();
        String lowerCase2 = str1.replaceAll("\\s", "").toLowerCase();

        return Arrays.equals(lowerCase1.chars().sorted().toArray(), lowerCase2.chars().sorted().toArray());


    }


}
