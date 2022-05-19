package crp.kr.api.auth.services;


import crp.kr.api.auth.domains.Users;
import crp.kr.api.auth.repositories.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * packageName: crp.kr.api.services
 * fileName : UserServiceimpl
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
@Service
public class UserServiceImpl implements UserServices{

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public String login(Users user) {
        return null;
    }

    @Override
    public List<Users> findAll() {
        return null;
    }

    @Override
    public Page<Users> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String put(Users user) {
        return null;
    }

    @Override
    public String delete(Users user) {
        return null;
    }

    @Override
    public String save(Users user) {
        return null;
    }

    @Override
    public Optional<Users> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public List<Users> findByUserName(String name) {
        return null;
    }

    @Override
    public List<Users> findAll(Sort sort) {
        return null;
    }
}