package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: crp.kr.api.soccer.repositories
 * fileName : StadiumRepositores
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
interface StadiumCustomRepository{
    // 스타디움 전화번호 tel 을 변경하도록 하시오
}
@Repository
public interface StadiumRepository extends JpaRepository<Stadium, Long> {
}