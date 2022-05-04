package crp.kr.api.domains;

import lombok.Data;
import lombok.Generated;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * packageName: crp.kr.api.domains
 * fileName : User
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
@Data
@Component//컴포넌트는 프로퍼티와 메소드의 집합이다.
@Entity
@Table(name="users")
public class User {
    @Id private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false) private String userid;
    @Column(nullable = false) private String password;
    @Column(nullable = false) private String email;
    @Column(nullable = false) private String name;
    private String phone;
    private String birth;
    private String address;
}
