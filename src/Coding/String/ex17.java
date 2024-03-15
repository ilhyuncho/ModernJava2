package Coding.String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// 문자열 내 부분 문자열 빈도수 세기
public class ex17 {

    private static final String str = "gggggfsdfwerwfsdfssdf";

    public static void main(String[] args) {

        int cont = test3("fs");
        System.out.println(cont);
    }

    public static int test3(String target){
        Pattern pattern = Pattern.compile(Pattern.quote(target));
        Matcher matcher = pattern.matcher(str);

        int position = 0;
        int count = 0;

        while(matcher.find(position)){
            System.out.println(matcher.start());
            position = matcher.start() + 1;
            count++;
        }

        return count;
    }
    public static String test2(String target){
        String[] split = str.split(target);
        System.out.println(split.length - 1);
        return "";
    }

    public static String test1(String target){
        String result="";

        int index =0;
        int count = 0;
        int n = target.length();

        while(index != -1){
            index = str.indexOf(target, index);
            if( index != -1){
                index += n;
                count++;
            }
        }
        System.out.println(count);

        return result;
    }


}
