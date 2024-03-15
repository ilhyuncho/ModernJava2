package Coding.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
//중복 문자 제거
public class ex12 {

    private static final String str = "absdfsda";
    private static final int ASCII_CODES = 256;

    public static void main(String[] args) {

        String result = test3();

        System.out.println(result);
    }
    public static String test3(){

        return Arrays.stream(str.split("")).distinct().collect(Collectors.joining());
    }

    public static String test2(){
        // StringBuilder 의 indexof 를 이용

        StringBuilder sb= new StringBuilder();

        for(char c : str.toCharArray()){
            if( -1 == sb.indexOf( String.valueOf(c) )){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String test1(){
        String result="";

        int[] flags = new int[ASCII_CODES];

        Arrays.fill(flags, -1);

        StringBuilder sb = new StringBuilder();

        for(int i= 0; i < str.length();i++ ){
            char c = str.charAt(i);

            if( flags[c] == -1 ){
                flags[c] = str.charAt(i);
                sb.append(c);
            }
            else if( flags[c] > 0){
                continue;
            }
        }

        return sb.toString();
    }


}
