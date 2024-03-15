package Coding.String;

// 부호 없는 두 수 비교
public class ex29 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        // JDK8 부터 부호 없는 값으로 비교
        int compare = Integer.compareUnsigned(Integer.MAX_VALUE,Integer.MIN_VALUE);
        System.out.println(compare);

        return result;
    }


}
