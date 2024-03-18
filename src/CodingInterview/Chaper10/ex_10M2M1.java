package CodingInterview.Chaper10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 문자열이 고유 문자만 포함할 경우 TRUE를 반환
public class ex_10M2M1 {

    private static final String strTest = "asd1234";
    public static void main(String[] args) {
        boolean result = test1();

        System.out.println(result);


    }

    public static boolean test1(){

        // codePointAt : 지정된 index의 유니코드 문자를 코드 포인트라고 하는 int로 반환 함

        if(strTest == null || strTest.isBlank()){
            return false;
        }
        Map<Character, Boolean> map = new HashMap<>();

        for(int i=0; i< strTest.length(); i++){
            if(strTest.codePointAt(i) <= 65535){
                char c = strTest.charAt(i);
              //  System.out.println(strTest.codePointAt(i));
                if( !Character.isWhitespace(c)) {
                    if(map.put(c,true) != null){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
