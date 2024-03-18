package CodingInterview.Chaper10;

import CodingInterview.StringMain;

import java.util.HashMap;
import java.util.Map;

// 문자열 요약하기 (  abbb vvvv s rttt -> a1b3 v4 s1 r1t3 )
//    abbb vvvv s rttt
// -> a1b3 v4 s1 r1t3
public class ex_10M2M5 {
    private static final String strTest = "abbb vvvv s rttt";
    public static void main(String[] args) {
        String result = test2();

        System.out.println(result);
    }
    public static String test2(){


        StringBuilder sb = new StringBuilder();

        int count=  0;

        for (int i = 0; i < strTest.length(); i++) {
            count++;

            if(!Character.isWhitespace(strTest.charAt(i))){
                // 더 이상 처리할 문자가 없거나, 다음 문자가 현재 개수를 세고 있는 문자와 다를때
                if((i+1) >= strTest.length() || strTest.charAt(i) != strTest.charAt(i+1)){
                    sb.append(strTest.charAt(i)).append(count);
                    count = 0;
                }
            }else{
                sb.append(strTest.charAt(i));
                count = 0;
            }
        }

        System.out.println(sb);
        return "";
    }
    public static String test1(){
        String result = "";


        char cuChar = Character.MIN_VALUE;
        int cuCount = 0;

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strTest.length(); i++) {
            char c1 = strTest.charAt(i);
            int i1 = strTest.codePointAt(i);

            if( i == 0 ){
                cuChar = c1;
                cuCount++;
            }
            else if (cuChar == c1) {
                cuCount++;
            }
            else if( Character.isWhitespace(c1)){
                sb.append( cuChar);
                if(cuCount > 0)
                    sb.append(String.valueOf(cuCount));

                cuChar = ' ';
                cuCount= 0 ;
            }
            else{

                sb.append( cuChar);
                if(cuCount > 0)
                    sb.append(String.valueOf(cuCount));
                cuChar = c1;
                cuCount = 1;
            }
        }
        map.put(cuChar, cuCount);
        sb.append( cuChar);
        sb.append(String.valueOf(cuCount));

        System.out.println(sb.toString());
        //map.forEach( (s, v) -> System.out.println(s+ ":" + v));
        return result;
    }
}
