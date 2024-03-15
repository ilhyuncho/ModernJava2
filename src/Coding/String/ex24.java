package Coding.String;

import java.util.stream.Stream;

// 문자열 변환
public class ex24 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test2();
        System.out.println(result);
    }
    public static String test2(){
        // GOOOOOOOOOOOOOOOOL!GOOOOOOOOOOOOOOOOL!
        String s1 = Stream.of("gooool!")
                .map(String::toUpperCase)
                .map(s -> s.repeat(2))
                .map(s -> s.replaceAll("O", "OOOO"))
                .findFirst()
                .get();

        return s1;
    }

    public static String test1(){
        // hello world 를 만듬
        String hello = Stream.of("hello")
                .map(s -> s + " world")
                .findFirst()
                .get();

        return hello;
    }


}
