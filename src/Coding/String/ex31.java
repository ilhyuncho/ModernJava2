package Coding.String;

// double/float가 유한 부동소수점 값인지 검사
public class ex31 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        // 유한 부동소수점 값인지 확인하려면
        // 주어진 float/double 값의 절댓값은 float/double 타입의 양의 최대 유한값을 초과해서는 안된다.

        // float의 경우
        Float f = 4.5f;
        System.out.println(Math.abs(f) <= Float.MAX_VALUE);

        // 자바8 부터 Float.isFinite() 과 Double.isFinite()로 조건을 검사 한다
        Float f1 = f / 0;
        boolean f1f = Float.isFinite(f1);
        System.out.println(f1f);    // false  ; Infinity는 유한하지 않다

        Float f2 = f / 0f;
        boolean f2f = Float.isFinite(f2);
        System.out.println(f2f);    // false  ; NaN 유한하지 않다

        return result;
    }


}
