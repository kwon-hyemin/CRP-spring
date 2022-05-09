package crp.kr.api.auth.services;

import crp.kr.api.auth.domains.User;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.services
 * fileName : UserServices
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
//추상 메소드만 가지고 잇음
public interface UserServices {

    String login(User user);

    List<User> findAll(Pageable pageable);

    String put(User user);

    String delete(User user);

    String save(User user);

    Optional<User> findById(String userid);

    boolean existsById(String userid);

    long count();
}
