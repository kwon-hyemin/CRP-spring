package crp.kr.api.common.algorithm;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * packageName: crp.kr.api.common.algorithm
 * fileName : RemoveDuplicaetedElementsArray
 * author  : 권혜민
 * date   : 2022-05-17
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-17     권혜민       최초 생성
 */
// 02-4 중복된 요소를 제거한 새배열을 반환하는 메서드를 작성해보라
// 중복 제거된 빈요소는 기본값 0으로 삽입
public class RemoveDuplicatedElementsArray {
    @Builder @Getter @AllArgsConstructor @NoArgsConstructor
    private static class Solution{
        private int[] ls;
        private int[] arr;
        @Override
        public String toString() {
            return String.format("새배열: %d", ls);
        }
    }
    @FunctionalInterface interface SolutionService{ Solution solution (Solution s);}
    @Test
    void solutionTest(){
        int[] arr = {5, 10, 9, 27, 2, 8, 10, 4, 27, 1};
//        int[] resultArr = Arrays.stream(arr).distinct().toArray(int[]::new);
//        arr = Arrays.stream(arr).distinct().toArray(String[]::new);
        SolutionService f = e ->  {

            return Solution.builder().build();
        };
    }

}
