import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class splitIteratorTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("콜팝");
        list.add("치킨");
        list.add("곱창");
        list.add("팝콘");
        list.add("피자");
        list.add("피자1");
        list.add("팝콘1");
        list.add("팝콘2");

        Spliterator<String> spliterator1 = list.spliterator();


        Spliterator<String> spliterator2 = spliterator1.trySplit();
        spliterator1.forEachRemaining(System.out::println);
        System.out.println("====== 구분선11111 ======");
        spliterator2.forEachRemaining(System.out::println);


        // 1. forEach 람다 사용
        spliterator1.forEachRemaining(s -> System.out.println(s));
        System.out.println("====== 구분선 ======");
        spliterator2.forEachRemaining(s -> System.out.println(s));

        // 2. forEach 메소드 사용
        spliterator1.forEachRemaining(System.out::println);
        System.out.println("====== 구분선 ======");
        spliterator2.forEachRemaining(System.out::println);

        // 3. tryAdvance 반복문 사용
        while(spliterator1.tryAdvance(System.out::println));
        System.out.println("====== 구분선 ======");
        while(spliterator2.tryAdvance(System.out::println));
    }
}
