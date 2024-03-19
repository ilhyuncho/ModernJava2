package Ramda;

import Coding.String.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ShadowingExam {
    private String firstName = "Char";
    public static void main(String[] args) {

       // new ShadowingExam().Sha("gdfgdfg");

        Integer[] array = new Integer[]{3,4,3,4};
        Arrays.sort(array, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });



        System.out.println(Arrays.stream(array).collect(Collectors.toList()));
    }

    public void Sha(String firstName){
        Function<String, String> addSurname = surname -> {
            // this.firstName 이면. 람다를 둘러산 범위를 참조하기 때문에 "Char"
            // firstName 은 매개변수를 가리킴
            return this.firstName + " " + surname;
        };

        System.out.println(addSurname.apply("gdfgdfg"));
    }
}
