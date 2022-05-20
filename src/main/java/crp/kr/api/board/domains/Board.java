package crp.kr.api.board.domains;

import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: crp.kr.api.domains
 * fileName : Board
 * author  : 권혜민
 * date   : 2022-05-04
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-04     권혜민       최초 생성
 */
@Data
@Component
@Entity
@Table(name="article")
public class Board {
    @Id Long id;

    private String projects;
    private String startDate;
    private String status;
    private String team;
    private String progress;
    private String action;

}
