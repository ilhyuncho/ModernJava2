package Coding.String;


// 문자열 회문 검사
// 회문 -> amdma

public class ex11 {

    private static final String str = "amdma";

    public static void main(String[] args) {

        System.out.println(test1());
    }


    public static boolean test1(){

        int left= 0 ;
        int right = str.length()-1;
        while (right > left) {
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


}
