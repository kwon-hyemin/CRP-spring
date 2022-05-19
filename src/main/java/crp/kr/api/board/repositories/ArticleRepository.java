package crp.kr.api.board.repositories;

import crp.kr.api.board.domains.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName: crp.kr.api.board.repositories
 * fileName : AricleRepositories
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
