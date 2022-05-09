package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Schedule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : ScheduleServices
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
public interface ScheduleServices {
    List<Schedule> findAll();

    long count();

    String delete(Schedule schedule);

    String save(Schedule schedule);

    Optional<Schedule> findById(String scheduleid);

    boolean existsById(String scheduleid);

    List<Schedule> findAll(Sort sort);

    Page<Schedule> findAll(Pageable pageable);
}
