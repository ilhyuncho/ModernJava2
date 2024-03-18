package CodingInterview.Chaper10;

import java.util.Arrays;

// 문자열의 모든 공백을 '%20'으로 치환하는 코드 작성
public class ex_10M2M3 {
    private static final String strTest = "fsdfsfsdf";
    public static void main(String[] args) {


        String result = test1();

        //System.out.println(result);
    }

    public static String test1(){
        String result = "";

        char[] str = " String   with spaces ".toCharArray();


        int whiteCount = 0;
        for (char c : str) {
            if( Character.isWhitespace(c)){
                whiteCount++;
            }
        }

        char[] str1 = new char[str.length + (whiteCount * 2)];
        System.out.println(str1.length);

        int newIndex = 0;
        for (int i = 0; i < str.length ; i++) {
            if( Character.isWhitespace(str[i])){
                str1[newIndex++] = '%';
                str1[newIndex++] = '2';
                str1[newIndex++] = '0';
            }
            else {
                str1[newIndex++] = str[i];
            }
        }

        //char[]로는 스트림을 곧바로 생성할 수 없었던 것이다

        String.valueOf(str1).chars().mapToObj( c -> (char)c)
                .forEach(System.out::println);

//        for (int i = 0; i < str1.length ; i++) {
//            System.out.println(str1[i]);
//        }

        return result;
    }
}
