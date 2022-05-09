package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.domains.Schedule;
import crp.kr.api.soccer.services.ScheduleServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.controllers
 * fileName : ScheduleController
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/Schedule")
public class ScheduleController {
    private final ScheduleServices service;
    @GetMapping("/findAll")
    public List<Schedule> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Schedule> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Schedule> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Schedule Schedule) {
        return service.delete(Schedule);
    }

    @PostMapping("/join")
    public String save(@RequestBody Schedule Schedule) {
        return service.save(Schedule);
    }

    @GetMapping("/findById/{Scheduleid}")
    public Optional<Schedule> findById(@PathVariable String Scheduleid) {
        return service.findById(Scheduleid);
    }

    @GetMapping("/existsById/{Scheduleid}")
    public boolean existsById(@PathVariable String Scheduleid) {
        return service.existsById(Scheduleid);
    }
    


}
