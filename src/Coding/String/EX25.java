package Coding.String;

// 두 수의 최솟값과 최댓값 계산
public class EX25 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        int i1 = -43;
        int i2 = -13;
        int min = Math.min(i1, i2);
        // JDK8 부터 윈시 수 타입의 각 래퍼 클래스에서 min 과 max 메서드 추가
        int min1 = Integer.min(i1, i2);

        System.out.println(min);
        System.out.println(min1);


        return result;
    }


}
