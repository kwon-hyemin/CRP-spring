package crp.kr.api.soccer.services;

import crp.kr.api.soccer.repositories.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * packageName: crp.kr.api.soccer.services
 * fileName : Serviceimpl
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
public class TeamServiceimpl implements TeamServices{
    private final TeamRepository teamRepository;
}
