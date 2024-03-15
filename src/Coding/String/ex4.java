package Coding.String;

// 숫자만 포함하는 문자열인지 검사
public class ex4 {

    private static final String text = "00034388434";


    // 숫자만 포함하는 문자열인지 검사
    // Character.isDigit 활용
    public static void main(String[] args) {

        System.out.println(test3());
    }

    public static boolean test1() {
        for(int i = 0; i < text.length() ; i++){
            if( !Character.isDigit(text.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static boolean test2() {
        // anyMatch()

        // IntStream으로 변화
        return text.chars().anyMatch(Character::isDigit);
    }
    public static boolean test3() {

        return text.matches("[0-9]+");
    }
}
