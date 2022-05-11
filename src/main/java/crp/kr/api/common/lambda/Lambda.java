package crp.kr.api.common.lambda;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

import static crp.kr.api.common.dataStructure.AppleList.Apple;

/**
 * packageName: crp.kr.api.common.lambda
 * fileName : LambdaUtil
 * author  : 권혜민
 * date   : 2022-05-11
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-11     권혜민       최초 생성
 */
public class Lambda {
    public static void main(String[] args) {
//        System.out.println(Lambda.integer("900"));
//        System.out.println(string(2));
//        System.out.println(string(new Apple.Builder().origin("영동").color("RED").price(3000).build()));
//        System.out.println(
//                string(
//                        Arrays.asList(
//                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
//                                new Apple.Builder().origin("영동").color("RED").price(3000).build(),
//                                new Apple.Builder().origin("영동").color("RED").price(3000).build()
//                        ))
//                        );
//        System.out.println(equals("2","3"));
        System.out.println(array(8).length);
    }
    public static int integer(String arg){
        Function<String, Integer> f = Integer::parseInt;
        return f.apply(arg);
    }

    public static String string(Object o){
        //String s = String.valueOf(Object)
        Function<Object, String> s = String::valueOf;
        return s.apply(0);
    }
    public static boolean equals(String s1, String s2){
        BiPredicate<String, String > p = String::equals;
        return p.test(s1, s2);
    }
    // int[] arr = new int[8]
    // =int[]::new
    // 이름은 array int[] 타입, size 8(파라미터)로 던지면 배열이 나온다.
    public static int[] array(int a){
        Function<Integer, int[]> f = int[]::new;
        return f.apply(a);
    }

    //객체이름 random
    // int temp = (int)(d * 6)+1;
    // double d = Math.random();
    // return 값 int
    // int p = random(1, 6);
    // int player =(int)(Math.random()*6)+1;

}
