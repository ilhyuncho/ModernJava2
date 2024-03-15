package Coding.String;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

// 모음과 자음 세기
public class ex5 {
    private static final String str = "fsdia";

    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a','e','i','o','u'));

    public static void main(String[] args) {

        Map<String, Integer> result = test1();

        result.entrySet().forEach((x) -> System.out.println(x));

        //test2();
        Map<Boolean, Long> booleanLongMap = test3();

        booleanLongMap.entrySet().forEach(System.out::println);


    }
    public static Map<Boolean, Long> test3() {
        Map<Boolean, Long> collect = str.chars().mapToObj(c -> (char) c).filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(Collectors.partitioningBy(c -> allVowels.contains(c), Collectors.counting()));
        return collect;
    }
    public static void test2() {

        long count = str.chars().filter( c-> allVowels.contains((char)c)).count();
        System.out.println(count);
    }

    public static Map<String, Integer> test1(){

        Map<String, Integer> result = new HashMap<>();

        int a = 0;
        int b = 0;

        for (char c : str.toLowerCase().toCharArray()) {
            if( allVowels.contains(c)){
                a++;
            }
            else if( c >= 'a' && c <= 'z' ){
                b++;
            }
        }

        result.put("a",a);
        result.put("b",b);

        return  result;
    }


}
