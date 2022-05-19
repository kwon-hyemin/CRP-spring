package crp.kr.api.auth.services;

import crp.kr.api.auth.domains.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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

    String login(Users user);

    List<Users> findAll();

    List<Users> findAll(Sort sort);

    Page<Users> findAll(Pageable pageable);

    long count();

    String put(Users user);

    String delete(Users user);

    String save(Users user);

    Optional<Users> findById(String userid);

    boolean existsById(String userid);

    // custom

    List<Users> findByUserName(String name);

}
