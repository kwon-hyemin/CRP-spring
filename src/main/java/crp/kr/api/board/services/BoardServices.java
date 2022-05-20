package crp.kr.api.board.services;

import crp.kr.api.board.domains.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.services
 * fileName : BoardServices
 * author  : 권혜민
 * date   : 2022-05-04
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-04     권혜민       최초 생성
 */

public interface BoardServices {

    List<Board> findAll();
    List<Board> findAll(Sort sort);
    Page<Board> findAll(Pageable pageable);

    long count();

    String delete(Board board);

    String save(Board board);

    Optional<Board> findById(String board);

    boolean existsById(String board);
}
