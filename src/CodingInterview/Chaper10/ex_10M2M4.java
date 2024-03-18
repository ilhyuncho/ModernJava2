package CodingInterview.Chaper10;

// 동일한 문자열 만들기 - 하나의 문자만 수정하여 q와 p가 동일한 문자열인지 확인

public class ex_10M2M4 {
    private static final String strTest = "bec";
    private static final String strTest1 = "aece";
    public static void main(String[] args) {


        boolean result = test1(strTest, strTest1);

        System.out.println(result);
    }

    public static boolean test1(String str1, String str2){
        String result = "";
        // 한번으로 수정으로 동일한 문자열을 만들수 있는 경우
        // q와 p의 길이 차이가 1 이하
        // q와 p의 차이점이 하나

        if( Math.abs(str1.length() - str2.length()) > 1){
            return false;
        }

        int is= 0 ;
        int il = 0;
        boolean marker = false;
        String shorter = str1.length() < str2.length() ? str1 : str2;
        String longer = str1.length() < str2.length() ? str2 : str1;

        while(is < shorter.length() && il < longer.length()){
            System.out.println(shorter.charAt(is) + ":" + longer.charAt(il));
            if (shorter.charAt(is) != longer.charAt(il)) {
                if(marker){
                    return false;
                }
                marker = true;

               // private static final String strTest = "bec;
               // private static final String strTest1 = "aece";

                if (shorter.length() == longer.length()) {
                    is++;
                }
            }else{
                is++;
            }

            il++;
        }

        return true;
    }
}
