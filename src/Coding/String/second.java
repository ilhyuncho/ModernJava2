package Coding.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class second {
    private static final String text = "My high schoMoly, the";

    private static final int ASCII_CODES = 256;

    public static void main(String[] args) {

        char firstChar =
                firstNonRepeatedCharacterV2();
        System.out.println(firstChar);
    }
    public static char firstNonRepeatedCharacterV2() {

        Map<Character, Integer> map = new LinkedHashMap<>();


        for(char c : text.toCharArray() ){
            map.compute(c, (k, v) -> (v == null) ? 1 : ++v );
        }

        for(Map.Entry<Character, Integer> entries : map.entrySet()){
            if(entries.getValue() == 1){
                return entries.getKey();
            }
        }

        return Character.MIN_VALUE;
    }
    public static char firstNonRepeatedCharacterV1() {
        int[] flags = new int[ASCII_CODES];

        Arrays.fill(flags, -1);

        System.out.println("Byte Max Value: "+Byte.MAX_VALUE);//print 127 Ok!
        System.out.println("Character Max Value: "+ Character.MAX_CODE_POINT);//print ?(Question Mark)
        System.out.println(Character.MAX_VALUE-1);//print 65534

        for( int i =0; i < text.length(); i++){
            char c = text.charAt(i);

            if( flags[c] == -1 ){   // 최초
                flags[c] = i;       // 포지셔 지정
            }else{
                flags[c] = -2;      // 두번째 이후
            }
        }

        int position = Integer.MAX_VALUE;

        for (int i = 0; i < ASCII_CODES; i++) {
            if( flags[i] >= 0){
                position = Math.min(position, flags[i]);
            }
            if(flags[i] == 110){
                System.out.println(flags[i]);
            }
        }
        System.out.println(position);
        return position == Integer.MAX_VALUE ? Character.MIN_VALUE : text.charAt(position);
    }





}
