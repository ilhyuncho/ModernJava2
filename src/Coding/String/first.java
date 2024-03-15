package Coding.String;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class first {
    private static final String text = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";



    public static void main(String[] args) {
        System.out.println(text.toString());

        String[] s = text.split(" ");


        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap        = countDuplicateCharacters(text);
//        for( Character key : characterIntegerMap.keySet() ){
//            System.out.println(key + ": " + characterIntegerMap.get(key));
//        }

        Map<Character, Long> characterIntegerMap1 = new HashMap<>();
        characterIntegerMap1        = countDuplicateCharacters1(text);
        for( Character key : characterIntegerMap1.keySet() ){
            System.out.println(key + ": " + characterIntegerMap1.get(key));
        }


        //putIfAbsent();
        //computeIfAbsent();

        String s1 = "A     B";
        System.out.println(text.codePointCount(0, text.length()));


    }
    // 001. 문자 갯수 세기
    public static Map<Character, Integer> countDuplicateCharacters(String str){

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length();i++) {
            char c = str.charAt(i);

//            if( map.containsKey(c) ){
//                Integer count = map.get(c);
//                map.put(c, ++count);
//            }
//            else{
//                map.put(c, 1);
//            }

            map.compute(c, (k, v) -> (v == null) ? 1 : ++v );
        }

        return map;
    }

    public static Map<Character, Long> countDuplicateCharacters1(String str) {
        Map<Character, Long> result = str.chars()   // IntStream을 반환
                .mapToObj(c-> (char)c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return result;

    }

    public static void putIfAbsent() {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 5);

        map.putIfAbsent("John", 10);
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }

        System.out.println("------------");
        map.putIfAbsent("John2", 10);
        //System.out.println(map.size());
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }
    }

    public static void computeIfAbsent() {
        Map<String, Integer> map = new HashMap<>();
        map.put("John", 5);
        map.computeIfPresent("John1", (k, v) -> v + 10);


        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }

    }


    
}
