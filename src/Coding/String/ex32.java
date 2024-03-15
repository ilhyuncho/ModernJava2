package Coding.String;
// 두 불 표현식에 논리 AND/OR/XOR 적용
public class ex32 {

    private static final String str = "00034388434";

    public static void main(String[] args) {

        String result = test1();
        System.out.println(result);
    }

    public static String test1(){
        String result="";

        int s = 10;
        int m = 21;

        // if( s > m && m < 50 ) {}
        if(Boolean.logicalAnd( s < m, m < 50)){
            System.out.println("true");
        }

        if(Boolean.logicalAnd(
                Boolean.logicalOr(s >m, m < 40),
                Boolean.logicalOr(s >m, m < 40))
        ){
            System.out.println("trueeeee");
        }



        return result;
    }


}
