package crp.kr.api.user.services;


import crp.kr.api.auth.configs.AuthProvider;
import crp.kr.api.auth.domains.Messenger;
import crp.kr.api.auth.exception.SecurityRuntimeException;
import crp.kr.api.user.domains.Role;
import crp.kr.api.user.domains.UserDto;
import crp.kr.api.user.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import crp.kr.api.user.domains.User;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;

import static crp.kr.api.common.lambdas.Lambda.longParse;
import static crp.kr.api.common.lambdas.Lambda.string;

/**
 * packageName: crp.kr.api.services
 * fileName : Usererviceimpl
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final AuthProvider provider; //이것들의 기능을 가지는 교차 엔티티==UserServiceImpl
    private final ModelMapper modelMapper;


    @Override
    public UserDto login(User user) {
        try{
            UserDto userDTO = modelMapper.map(user, UserDto.class); //  userDTO 를 보내야함 userDB허용하면 큰일남 //dto 는 외부에서 노출되어있지 않음
            User findUser  = repository.findByUsername(user.getUsername()).orElse(null);
            String pw = repository.findByUsername(user.getUsername()).get().getPassword();
            boolean checkPassword = encoder.matches(user.getPassword(), pw);
            String username = user.getUsername(); // 사람이 인지하는 아이디
            List<Role> roles = findUser.getRoles();
            String token = checkPassword ? provider.createToken(username,roles) : "Wrong Password";  //이걸 인지하고 있어야함 고객한테 알려줘야해서 에러가 낫는데 비밀번호가 틀렸어요 해야함
            userDTO.setToken(token);// dto의 임시박스
            return userDTO;


        }catch (Exception e){
            throw new SecurityRuntimeException("유효하지 않은 아이디/비밀번호", HttpStatus.UNPROCESSABLE_ENTITY); // 회사에 따라서 여러가지 인셉션을 걸수잇음
        }//문제가 생기면 처리하는 코드
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public List<User> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<User> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Messenger count () {

        return Messenger.builder().message(string(repository.count())).build();
    } // 애매한 리턴값은 다 messenger에 담는다

    @Override
    public Messenger update(User user) {
        return Messenger.builder().build();
    }

    @Override
    public Messenger delete(User user) {
        repository.delete(user);
        return Messenger.builder().build();
    }

    @Override
    public Messenger save(User user) {
        String result = "";
//        User o = repository.findByUsername(user.getUsername()).orElse(null);// null을 반납하게 만듬
//        boolean existUsernameCheck = o == null;//null ? true:false;
        if(repository.findByUsername(user.getUsername()).isEmpty()){
            List<Role> list = new ArrayList<>();
            list.add(Role.USER);
            repository.save(User.builder().password(encoder.encode(user.getPassword()))
                    .roles(list).build());
//            return provider.createToken(user.getUsername(),user.getRoles());
            result = "SUCCESS";
        }else {
            result = "FAIL";
        }
        return Messenger.builder().message(result).build();
    }

    @Override
    public Optional<User> findById(String userid) {
        return repository.findById(0L);
    }

    @Override
    public Messenger existsById(String userid) {
        return repository.existsById(longParse(userid))
                ? Messenger.builder().message("EXIST").build()
                : Messenger.builder().message("NOT_EXIST").build(); // userid 타입이 다름
    }


    @Override
    public List<User> findByUserName(String name) {
        return null;
    }

    @Override
    public Messenger put(User user) {
        return null;
    }
}