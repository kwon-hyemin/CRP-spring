package crp.kr.api.common.streams;

import lombok.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * packageName: crp.kr.api.common.streams
 * fileName : PersonStream
 * author  : 권혜민
 * date   : 2022-05-16
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-16     권혜민       최초 생성
 */
public class PersonStream {
    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Person{
        private String name, ssn;

        @Override
        public String toString() {
            String gender = (ssn.substring(7,8).equals("1") || ssn.substring(7,8).equals("3"))? "남자" : "여자";
//            String age = ();
            return String.format("이름: %s 성별:%s", name, gender);
        }

    }
    // 기능 : 회원검색
    interface PersonService{ Person search(List<Person> persons);}
    public static class PersonServiceImpl implements PersonService{
        @Override
        public Person search(List<Person> persons) {
            return persons
                    .stream()
                    .filter(e -> e.getName().equals("유관순"))
                    .collect(Collectors.toList()).get(0);
        }
    }
    @Test
    void personStreamTest(){
        //:"홍길동","900120-1"
        //:"김유신","970120-1"
        //:"유관순","040120-4"
        // 남성 , 여성  나이 판단 로직
        List<Person> l = Arrays.asList(
                Person.builder().name("홍길동").ssn("900120-1").build(),
                Person.builder().name("김유신").ssn("970120-1").build(),
                Person.builder().name("유관순").ssn("040120-4").build()
        );

        System.out.println( new PersonServiceImpl().search(l));
    }
}
