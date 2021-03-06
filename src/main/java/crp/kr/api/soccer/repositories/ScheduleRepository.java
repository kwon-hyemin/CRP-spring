package crp.kr.api.soccer.repositories;

import crp.kr.api.soccer.domains.Schedule;
import crp.kr.api.soccer.domains.Stadium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: crp.kr.api.soccer.repositories
 * fileName : ScheduleRepositores
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */

interface ScheduleCustomRepository{
    // 스케줄 날짜만 수정이 되도록 하시오
}
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
}