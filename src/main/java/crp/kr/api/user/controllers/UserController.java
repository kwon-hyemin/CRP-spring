package crp.kr.api.user.controllers;

import crp.kr.api.auth.domains.Messenger;
import crp.kr.api.user.domains.UserDto;
import crp.kr.api.user.services.UserService;
import lombok.RequiredArgsConstructor;
import crp.kr.api.user.domains.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
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
    private final UserService service;

    @PostMapping("/login")
    public ResponseEntity<UserDto> login(@RequestBody User user) {
        return ResponseEntity.ok(service.login(user));//
    }
    @GetMapping("/logout")
    public  ResponseEntity<Messenger> logout() {
        return ResponseEntity.ok(service.logout());
    }

    @PutMapping("/update")
    public ResponseEntity<Messenger> update(@RequestBody User user) {
        return ResponseEntity.ok(service.update(user));

    }
    @PutMapping("/put")
    public ResponseEntity<Messenger> put(@RequestBody User user) {
        return ResponseEntity.ok(service.put(user));
    }

    // Embeded Methods
    @GetMapping("/findAll")
    public List<User> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<User> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<User> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public ResponseEntity<Messenger> count() {
        return ResponseEntity.ok(service.count());
    }

    @DeleteMapping("/delete")
    public ResponseEntity<Messenger> delete(@RequestBody User user) {
        return ResponseEntity.ok(service.delete(user));
    }

    @PostMapping("/join")
    public ResponseEntity<Messenger> save(@RequestBody User user) {
        return ResponseEntity.ok(service.save(user));
    }

    @GetMapping("/findById/{userid}")
    public Optional<User> findById(@PathVariable String userid) {
        return service.findById(userid);
    }

    @GetMapping("/existsById/{userid}")
    public ResponseEntity<Messenger> existsById(@PathVariable String userid) {
        return ResponseEntity.ok(service.existsById(userid));
    }


}
