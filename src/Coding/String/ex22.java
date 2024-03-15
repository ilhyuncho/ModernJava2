package Coding.String;

// 가장 긴 공통 접두사 찾기
public class ex22 {

    private static final String str[] = {"abc", "accdf", "abcdgg", "ab", "abcd"};   // "ab" 문자 찾기

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        if( str.length == 1){
            return str[0];
        }

        int firstLen = str[0].length(); // 3

        for(int prefixLen = 0; prefixLen < firstLen; prefixLen++){
            char ch = str[0].charAt(prefixLen); // a -> b -> c
            for(int i = 1; i < str.length; i++){    // 배열 2번째 부터 순차

                //  prefixLen : 0,  str[i].length() : 5
                if(prefixLen >= str[i].length() || str[i].charAt(prefixLen) != ch){
                    return str[i].substring(0, prefixLen);
                }

            }
        }
        return str[0];
    }


}
