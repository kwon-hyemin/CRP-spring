package crp.kr.api.enums;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

/**
 * packageName: crp.kr.api.enums
 * fileName : Calculator
 * author  : 권혜민
 * date   : 2022-05-13
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-13     권혜민       최초 생성
 */
public class Calculator {

    @RequiredArgsConstructor
    enum Operation {
        PLUS("+", (x, y) -> (x + y)),
        MINUS("+", (x, y) -> (x - y)),
        MULTI("+", (x, y) -> (x * y)),
        DIVIDE("+", (x, y) -> (x / y)),
        ;
        private final String opcode;
        private final BiFunction<Integer, Integer, Integer> f;

        @Override
        public String toString() {
            return opcode;
        }

        public int apply(int a, int b) {
            return f.apply(a, b);
        }
    }

    @Test void CalculatorTest() {
        System.out.println("+:" + Operation.PLUS.apply(7, 5));
        System.out.println("+:" + Operation.MINUS.apply(7, 5));
        System.out.println("+:" + Operation.MULTI.apply(7, 5));
        System.out.println("+:" + Operation.DIVIDE.apply(7, 5));
    }
}
