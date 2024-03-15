package Coding.String;

import java.util.*;
import java.util.stream.Collectors;

// 빈도수가 가장 높은 문자 찾기
public class ex14 {

    private static final String str = "fsfsdfsdfaaaa";

    public static void main(String[] args) {

        Map<Character, Integer> result = test1();
        System.out.println(result.toString());
    }

    public static Map<Character, Integer> test1(){
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> result = new HashMap<>();

        for (char c : str.toCharArray()) {
                map.compute(c, (k, v)-> (v == null) ? 1 : ++v);
        }

        Integer max = Collections.max(map.values());
        System.out.println(max);
        char maxCharacter = Character.MIN_VALUE;

        for(Map.Entry<Character, Integer> entries : map.entrySet()) {
            if (entries.getValue().equals(max)) {
                maxCharacter = entries.getKey();
                result.put(maxCharacter, max);
            }
        }

        return result;
    }


}
