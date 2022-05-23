package crp.kr.api.soccer.services;

import crp.kr.api.soccer.domains.Stadium;
import crp.kr.api.soccer.repositories.StadiumRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : StadiumServiceimpl
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
public class StadiumServiceImpl implements StadiumService {
    private final StadiumRepository repository;

    @Override
    public String login(Stadium stadium) {
        return null;
    }

    @Override
    public List<Stadium> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Stadium> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<Stadium> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public long count() {
        return repository.count();
    }
    @Override
    public String delete(Stadium stadium) {
        repository.delete(stadium);
        return "";
    }

    @Override
    public String save(Stadium stadium) {
        repository.save(stadium);
        return "";
    }

    @Override
    public Optional<Stadium> findById(String playerId) {
        return repository.findById(0L);
    }

    @Override
    public boolean existsById(String playerId) {
        return repository.existsById(0L);
    }
}
