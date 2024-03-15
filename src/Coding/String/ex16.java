package Coding.String;

// 문자열이 부분 문자열을 포함하는지 검사
public class ex16 {

    private static final String str = "gdfgweruofsdhfksjdfwer";

    public static void main(String[] args) {

        String result = test2("fsdh");
        System.out.println(result);
    }

    public static String test2(String target) {
        // test1 방식으로 안내 된다.
        System.out.println(str.indexOf(target) != -1);
        return "";
    }

    public static String test1(String target){
        String result="";

        boolean contains = str.contains(target);

        System.out.println(contains);

        return result;
    }


}
