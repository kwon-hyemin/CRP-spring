package crp.kr.api.auth.controllers;

import crp.kr.api.auth.services.UserServices;
import lombok.RequiredArgsConstructor;
import crp.kr.api.auth.domains.User;
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
    public String login(@RequestBody User user) {
        return service.login(user);
    }
    @GetMapping("/logout")
    public String logout() {
        return "";
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        Pageable pageable = null;
        return service.findAll(pageable);
    }

    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll((Pageable) sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return (Page<User>) service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @PutMapping("/put")
    public String put(@RequestBody User user) {
        return service.put(user);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody User user) {
        return service.delete(user);
    }

    @PostMapping("/join")
    public String save(@RequestBody User user) {
        return service.save(user);
    }

    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public boolean existsById(@PathVariable String userid) {
        return service.existsById(userid);
    }


}