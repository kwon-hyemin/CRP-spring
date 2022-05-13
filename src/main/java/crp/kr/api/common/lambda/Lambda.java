package crp.kr.api.common.lambda;

import crp.kr.api.common.dataStructure.AppleList;

import java.io.File;
import java.util.Arrays;
import java.util.Random;
import java.util.function.*;

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
//        System.out.println(string(new AppleList.Apple.Builder().origin("영동").color("RED").price(3000).build()));
//        System.out.println(
//                string(
//                        Arrays.asList(
//                                new AppleList.Apple.Builder().origin("영동").color("RED").price(3000).build(),
//                                new AppleList.Apple.Builder().origin("영동").color("RED").price(3000).build(),
//                                new AppleList.Apple.Builder().build()
//                        ))
//                        );
//        System.out.println(equals("2","3"));
//        System.out.println(array(8).length);
//        System.out.println(random2(1,6));
        System.out.println(random3(1, 6));

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
//    public static int random(int i, int i1){
//        Consumer<Random> c = Random;
//    }

//    double random(int i, int i1){
//        BiFunction<Integer, Integer, Double> c = Random::new;
//        return c.apply(i , i1);
//    }

    String choi(int i){
        Function<Integer, String> c = String::valueOf;
        return c.apply(i);
    }
//        Consumer<Integer> f3 = Math::random;n
    public static double random2(int min, int max){
        Supplier<Double> s = Math::random;
        return ((int)(s.get()*max)+min);
    }
    public static int random3(int min, int max){
        BiFunction<Integer, Integer, Integer> f = (f1, f2) ->  (int)(Math.random()*f1)+f2;
        return f.apply(min, max);
    }
// File file = new File (d:\\ example\\new_directory);
    public static File makefile(String m){
        Function<String , File> f = File::new;
        return f.apply(m);
    }



}
