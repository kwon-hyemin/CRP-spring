package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
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
public interface PlayerServices {
    List<Player> findAll();

    long count();

    String delete(Player player);

    String save(Player player);

    boolean existsById(String playerid);

    Optional<Player> findById(String playerid);

    List<Player> findAll(Sort sort);

    Page<Player> findAll(Pageable pageable);
}
