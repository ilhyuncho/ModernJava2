package Coding.String;

// 들여쓰기 적용
public class ex23 {

    private static final String str = """
            Sunday
            MOnday
            dOnday
            """;

    // 아래 처림 출력
   //"         Sunday"
   //"         MOnday"
   //"         dOnday"

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        String indent = str.indent(10);

        System.out.println(indent);

        return result;
    }


}
