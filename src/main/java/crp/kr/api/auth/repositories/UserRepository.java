package crp.kr.api.auth.repositories;


import crp.kr.api.auth.domains.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: crp.kr.api.repositories
 * fileName : UserRepositories
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    void put(Users user);

    String login(Users user);
}
