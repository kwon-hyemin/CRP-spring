package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : PlayerServices
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
public interface PlayerService {
    String login(Player Player);

    List<Player> findAll();

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);

    long count();


    String delete(Player player);

    String save(Player player);

    Optional<Player> findById(String playerId);

    boolean existsById(String playerId);

    // custom

}
