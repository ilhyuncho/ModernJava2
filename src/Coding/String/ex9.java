package Coding.String;

import java.util.StringJoiner;

// 구분자로 여러 문자열 합치기
public class ex9 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String[] st = {"fsdfs", "gdfg", "gdfgdg"};

        System.out.println(test2('-',st ));

        // 다른 방법
        String.join(" ", st);


    }

    public static String test2(char delimiter,String... args){
        StringJoiner sj = new StringJoiner(String.valueOf(delimiter));

        for (String s : args) {
            sj.add(s);

        }
        return sj.toString();
    }
    public static String test1(char delimiter,String... args){
        String result="";

        StringBuilder sb = new StringBuilder();
        int i = 0;
        for( i = 0; i < args.length-1; i++){
            StringBuilder temp = new StringBuilder(args[i]).append(delimiter);
            sb.append(temp);
        }
        sb.append(args[i]);

        return sb.toString();
    }


}
