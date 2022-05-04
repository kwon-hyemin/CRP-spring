package crp.kr.api.controllers;

import crp.kr.api.domains.User;
import crp.kr.api.services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
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



}
