package crp.kr.api.board.services;

import crp.kr.api.board.domains.Article;
import crp.kr.api.board.repositories.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.board.services
 * fileName : ArticleService
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
public class ArticleServiceimpl implements ArticleServices {
    private  final ArticleRepository articleRepository;
    @Override
    public List<Article> findAll() {
        return null;
    }
    @Override
    public List<Article> findAll(Sort sort) {
        return null;
    }
    @Override
    public Page<Article> findAll(Pageable pageable) {

        return null;
    }
    @Override
    public long count() {
        return 0;
    }

    @Override
    public String delete(Article article) {
        return null;
    }

    @Override
    public String save(Article article) {

        return "";
    }
}
