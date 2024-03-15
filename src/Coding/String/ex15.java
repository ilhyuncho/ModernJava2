package Coding.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

// 문자열 배열을 길이 순으로 정렬
public class ex15 {
    private static final String[] arrStr = new String[]{"fsdf","gd","sdfsdfaserer", "gdfhghrt"};


    public static void main(String[] args) {

        String[] result = test3();

        Arrays.stream(result).forEach(System.out::println);
    }
    public static String[] test3(){
        String[] result = null;

        String[] array = Arrays.stream(arrStr)
                .sorted(Comparator.comparingInt(String::length)).toArray(String[]::new);

        return array;

    }
    public static String[] test2(){
        String result="";

        Arrays.sort(arrStr, Comparator.comparingInt( String::length).reversed());

        return arrStr;
    }

    public static String[] test1(){
        String result="";

        Arrays.sort(arrStr, (String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

        return arrStr;
    }


}
