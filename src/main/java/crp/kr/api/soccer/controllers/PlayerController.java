package crp.kr.api.soccer.controllers;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.services.PlayerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.controllers
 * fileName : PlayerController
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
@RequestMapping("/Player")
public class PlayerController {
    private final PlayerServices service;
    @GetMapping("/findAll")
    public List<Player> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Player> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Player> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Player Player) {
        return service.delete(Player);
    }

    @PostMapping("/join")
    public String save(@RequestBody Player Player) {
        return service.save(Player);
    }

    @GetMapping("/findById/{Playerid}")
    public Optional<Player> findById(@PathVariable String Playerid) {
        return service.findById(Playerid);
    }

    @GetMapping("/existsById/{Playerid}")
    public boolean existsById(@PathVariable String Playerid) {
        return service.existsById(Playerid);
    }
    
}