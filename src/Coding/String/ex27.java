package Coding.String;

// 기수를 지정해 문자열을 보호 없는 수로 변환
public class ex27 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        String nri = "255500";
    
        // 문자열을 기수 36(허용 가능한 최대 기수)으로 지정해 부호 없는 int 값으로 파싱
        int result1 = Integer.parseUnsignedInt(nri, Character.MAX_RADIX);

        System.out.println(result1);    // 129570192

        // 기수가 10 일때
        int result2 = Integer.parseUnsignedInt(nri);

        System.out.println(result2);    // 255500

        return result;
    }


}
