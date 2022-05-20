package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Player;
import crp.kr.api.soccer.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : PlayerServiceimpl
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
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository repository;


    @Override
    public String login(Player Player) {
        return null;
    }

    @Override
    public List<Player> findAll() {
        return null;
    }

    @Override
    public List<Player> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Player> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String put(Player Player) {
        return null;
    }

    @Override
    public String delete(Player Player) {
        return null;
    }

    @Override
    public String save(Player Player) {
        return null;
    }

    @Override
    public Optional<Player> findById(String userid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String userid) {
        return false;
    }

    @Override
    public List<Player> findByUserName(String name) {
        return null;
    }
}