package CodingInterview.Chaper10;

// 정수 추출하기 ( 연속되 숫자는 모두 유효한 정수 )
public class ex_10M2M6 {
    private static final String strTest = "222cv fd55f 7 4k 493jj 4d4";
    public static void main(String[] args) {
        String result = test1();

        System.out.println(result);
    }

    public static String test1(){
        String result = "";

        StringBuilder sb = new StringBuilder();

        int startIndex = -1;
        // 48 ~ 97
        // "cv fd55f 7 4k 493jj 4d";
        for (int i = 0; i < strTest.length(); i++) {
            char c = strTest.charAt(i);

            if( startIndex == -1 && Character.isDigit(c)){
                startIndex = i;
            }
            else if( startIndex != -1 && !Character.isDigit(c)){
                sb.append( strTest.substring(startIndex, i));
                sb.append(", ");
                startIndex = -1;
            }
        }

        if( startIndex != -1) {
            sb.append(strTest.substring(startIndex, startIndex + 1));
        }

        System.out.println(sb.toString());



        return result;
    }
}
