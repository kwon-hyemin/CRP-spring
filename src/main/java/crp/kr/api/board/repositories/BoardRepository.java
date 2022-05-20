package crp.kr.api.board.repositories;

import crp.kr.api.board.domains.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: crp.kr.api.board.repositories
 * fileName : BordRepository
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
interface BoardCustomRepository{
    // 000. 게시판 이름 boardName 을 변경하시오
}
@Repository
public interface BoardRepository extends JpaRepository<Board,Long>{
}