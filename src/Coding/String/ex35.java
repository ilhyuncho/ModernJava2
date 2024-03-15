package Coding.String;

// 나눗셈과 나머지의 버림 계산
public class ex35 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        int z = 222/14;
        System.out.println(z);  // 15.85 이지만 나눗셈의 목을 버리한 15가 정상 출력

        // 만약 부호가 서로 반대이면
        int z1 = -222/14;
        System.out.println(z1); // -16이 아닌 -15가 나온다

        // JDK8 부터
        int x = -222;
        int y = 14;
        int z3 = Math.floorDiv(x,y);
        System.out.println(z3); // 정상적으로 -16 출력


        return result;
    }


}
