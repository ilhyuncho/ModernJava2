package Coding.String;

// 글자와 단어 뒤집기
public class ex3 {
    private static final String text = "Be strong, be fearless, be beautiful. "
            + "And believe that anything is possible when you have the right "
            + "people there to support you. ";

    private static final String WHITESPACE = " ";

    public static void main(String[] args) {

        String reverseWord = reverseWords1(text);
        System.out.println(reverseWord);

//        StringBuilder sb = new StringBuilder(text);
//        sb.reverse();
//        System.out.println(sb);
    }

    private static String reverseWords1(String str) {
        String[] words = str.split(WHITESPACE);

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWo = new StringBuilder();

            for (int i = word.length() -1; i >= 0; i--) {
                reverseWo.append( word.charAt(i));

            }
            sb.append(reverseWo).append(WHITESPACE);
        }

        return sb.toString();
    }


}
