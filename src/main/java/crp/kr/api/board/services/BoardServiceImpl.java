package crp.kr.api.board.services;

import crp.kr.api.board.domains.Board;
import crp.kr.api.board.repositories.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.services
 * fileName : BoardServiceimpl
 * author  : 권혜민
 * date   : 2022-05-04
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-04     권혜민       최초 생성
 */
@RequiredArgsConstructor
@Service
public class BoardServiceImpl implements BoardServices {
    private  final BoardRepository repository;

    @Override
    public List<Board> findAll() {
        return null;
    }

    @Override
    public List<Board> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Board> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public String delete(Board board) {
        return null;
    }

    @Override
    public String save(Board board) {
        return null;
    }

    @Override
    public Optional<Board> findById(String board) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String board) {
        return false;
    }
}
