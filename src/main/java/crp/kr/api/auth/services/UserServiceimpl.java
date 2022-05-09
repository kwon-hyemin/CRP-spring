package crp.kr.api.auth.services;


import crp.kr.api.auth.domains.User;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
public class UserServiceimpl implements UserServices{

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public List<User> findAll(Pageable pageable) {
        return null;
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
    public long count() {
        return 0;
    }
}
