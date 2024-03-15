package Coding.String;

import java.util.stream.Stream;

// 여러 줄 문자열(텍스트 블록) 선언
public class ex19 {

    // java15 부터
    private static final String str = """
            fsdf
            fsdfsdf
            388434.""";

    public static void main(String[] args) {

        String result = test3();
        System.out.println(result);
    }

    public static String test3(){
        // 별도로... 문자열에서 여러줄로 된 것을 라인별로 구분하기
        Stream<String> lines = str.lines();

        lines.forEach(System.out::println);
        return "";
    }
    public static String test2(){
        String LS = System.lineSeparator();

        String text = "fsdfsdf " + LS + "gdfgdfgdfg";

        String text1 = String.format("gdfgdfg" + LS + "     fsfsdfsdf-------" + LS);

        System.out.println(text);
        System.out.println(text1);

        return "";
    }
    public static String test1(){
        // 각 os에 맞는 개행 문자를 리턴
        String LS = System.lineSeparator();

        String result= String.join(LS,"asfsdf ", "gdfgdf sdfsdf", "             gdfgdfg");

        return result;
    }


}
