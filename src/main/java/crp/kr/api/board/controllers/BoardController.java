package crp.kr.api.board.controllers;

import crp.kr.api.board.domains.Board;
import crp.kr.api.board.services.BoardServices;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.controllers
 * fileName : BoadController
 * author  : 권혜민
 * date   : 2022-05-04
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-04     권혜민       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardServices service;

    @GetMapping("/findAll")
    public List<Board> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAll/sort")
    public List<Board> findAll(Sort sort) {
        return service.findAll(sort);
    }

    @GetMapping("/findAll/pageable")
    public Page<Board> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }

    @GetMapping("/count")
    public long count() {
        return service.count();
    }

    @DeleteMapping("/delete")
    public String delete(@RequestBody Board board) {
        return service.delete(board);
    }

    @PostMapping("/join")
    public String save(@RequestBody Board board) {
        return service.save(board);
    }

    @GetMapping("/findById/{board}")
    public Optional<Board> findById(@PathVariable String board) {
        return service.findById(board);
    }

    @GetMapping("/existsById/{board}")
    public boolean existsById(@PathVariable String board) {
        return service.existsById(board);
    }
}