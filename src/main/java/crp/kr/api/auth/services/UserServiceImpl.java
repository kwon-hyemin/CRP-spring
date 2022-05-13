package crp.kr.api.auth.services;


import crp.kr.api.auth.domains.User;
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
    public String login(User user) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String put(User user) {
        return null;
    }

    @Override
    public String delete(User user) {
        return null;
    }

    @Override
    public String save(User user) {
        return null;
    }

    @Override
    public Optional<User> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public List<User> findByUserName(String name) {
        return null;
    }

    @Override
    public List<User> findAll(Sort sort) {
        return null;
    }
}