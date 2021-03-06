package crp.kr.api.controllers.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Scanner;

/**
 * packageName: crp.kr.api.dataStructure
 * fileName : MemberCRUD
 * author  : 권혜민
 * date   : 2022-05-09
 * desc   :
 * ================================
 * DATE        AUTHOR       NOTE
 * ================================
 * 2022-05-09     권혜민       최초 생성
 */
public class MemberCRUD {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("0.exit 1.register 2.findById 3.findByName 4.memberList" +
                    "5.count 6.update 7.remove");
            switch (s.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                default:break;
            }
        }
    }
    @Data @AllArgsConstructor class Memhber{
        protected String userid, name, password, profileImg, phone, email;
        @Override public String toString(){
            return String.format("사용자 스팩:userid: %s,name: %s,password: %s,profileImg: %s,phone: %s,email: %s",userid, name, password, profileImg, phone, email);
        }
    }
    @RequiredArgsConstructor
    class MemberService{
        private final Map<String, Memhber> map;
        void register(Memhber member){map.put(member.getUserid(),member);}
    }
}
