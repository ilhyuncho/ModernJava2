package Coding.String;

// 문자열 앞과 뒤 공백 제거
public class ex21 {

    private static char space = '\u2002';  // trim()이 인식하지 못하는 또 다른 종류의 여백이다 ( '\u2002'는 '\u0020'보다 크다
    private static final String str = space + "  dfs  dfsdf  " + "rwerwe";

    // 여백으로 정의된 문자는 25개인데, trim()은 그중 일부만 처리한다. ( 간단히 말해 trim()은 유니코드를 인식하지 못한다 )

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test2(){
        // 이 문제를 해결하기 위해 jdk11 부터 strip()을 도입 함
        // trim() 기능을 유니코드의 영역까지 확장 함
        String strip = str.strip();
        System.out.println(strip);

        return "";
    }
    public static String test1(){
        String result="";

        String trim = str.trim();

        System.out.println(trim);

        return result;
    }


}
