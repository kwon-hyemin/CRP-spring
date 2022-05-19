package crp.kr.api.auth.controllers;

import crp.kr.api.auth.services.UserServices;
import lombok.RequiredArgsConstructor;
import crp.kr.api.auth.domains.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
/**
 * packageName: crp.kr.api.controllers
 * fileName : UserController
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
@RequiredArgsConstructor
@RestController//잇어야 DTO의 자식임을 알려줄수 있음
@RequestMapping("/user")
public class UserController {
    private final UserServices service;

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return service.login(user);
    }

    @GetMapping("/logout")
    public String logout() {
        return "";
    }
    @PutMapping("/put")
    public String put(@RequestBody Users user) {
        return service.put(user);
    }

    // Embeded Methods
    @GetMapping("/findAll")
    public List<Users> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Users> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Users> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Users user) {
        return service.delete(user);
    }

    @PostMapping("/join")
    public String save(@RequestBody Users user) {
        return service.save(user);
    }

    @GetMapping("/findById/{userid}")
    public Optional<Users> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }
}
