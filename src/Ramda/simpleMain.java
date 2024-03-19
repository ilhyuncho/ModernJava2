package Ramda;

import java.util.function.Function;

public class simpleMain {
    public static void main(String[] args) {
        simple df = new simple(){
            @Override
            public Integer apply(Integer rag) {
               return rag * 7;
            }
        };
        System.out.println(df.apply(9));

        test(rag -> rag * 7);

    }
    public static void test(simple arg){

        System.out.println(arg.apply( 4));
    }
}
