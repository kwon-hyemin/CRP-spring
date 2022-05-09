package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Schedule;
import crp.kr.api.soccer.repositories.ScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : ScheduleServiceimpl
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
@Service
@RequiredArgsConstructor
public class ScheduleServiceimpl implements ScheduleServices{
    private final ScheduleRepository scheduleRepositores;

    @Override
    public List<Schedule> findAll() {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String delete(Schedule schedule) {
        return null;
    }

    @Override
    public String save(Schedule schedule) {
        return null;
    }

    @Override
    public Optional<Schedule> findById(String scheduleid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String scheduleid) {
        return false;
    }

    @Override
    public Page<Schedule> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Schedule> findAll(Sort sort) {
        return null;
    }
}
