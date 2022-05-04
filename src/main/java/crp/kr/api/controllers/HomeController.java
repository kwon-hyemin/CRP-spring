package crp.kr.api.controllers;

import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * packageName: crp.kr.api.controllers
 * fileName : HomeController
 * author  : 권혜민
 * date   : 2022-05-03
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-03     권혜민       최초 생성
 *///공부해
@RestController
public class HomeController {
    @GetMapping("/")
        public String now(){
            return new SimpleDateFormat("yyyy-MM-dd- hh:mm:ss").format(new Date());
    }

}
