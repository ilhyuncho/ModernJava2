package CodingInterview.Chaper10;

public class ex_10M2M7 {
    private static final String strTest = "";
    public static void main(String[] args) {
        String result = test1();

        System.out.println(result);
    }

    public static String test1(){
        String result = "";

        char[] musicalScore = new char[]{'\uD83C','\uDFBC'};
        System.out.println(String.valueOf(musicalScore));

        // 하트 기호
        String str = String.valueOf(Character.toChars(128149));
        char[] heart = new char[]{'\uD83D','\uDC95'};
        System.out.println(str + "=" + String.valueOf(heart));

        System.out.println(str.codePointCount(0, str.length()));    // 길이가 2여도 1을 반환

        System.out.println(str.codePointAt(0));
        System.out.println(str.codePointAt(1));




        return result;
    }
}
