package test.service;

import huayq.cn.blog.service.api.BlogService;
import huayq.cn.blog.service.api.UserService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.comment.user.UserReqDTO;
import huayq.cn.blog.service.api.model.comment.user.result.UserResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseApplicationTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 20:18 2022/12/22
 */
@Slf4j
public class UserServiceTest extends BaseApplicationTest {

    @Autowired
    UserService userService;

    @Test
    public void addUserTest(){
        UserReqDTO userReqDTO = new UserReqDTO();
        userReqDTO
                .setUsername("hyq11")
                .setPassword("123")
                .setStatus("normal")
                .setOperator("hyq");
        Result<Boolean> result = userService.addUser(userReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void modifyUserTest(){
        UserReqDTO userReqDTO = new UserReqDTO();

        userReqDTO
                .setUserNo("1671783772776")
                .setUsername("1anv")
                .setPassword("321")
                .setStatus("111")
                .setOperator("hyq");

        Result<Boolean> result = userService.modifyUser(userReqDTO, "");

        log.info("result:{}", result);
    }

    @Test
    public void queryUserTest(){

        Result<UserResDTO> result = userService.queryUserById("1671783772776", "");

        log.info("result:{}", result);
    }

    @Test
    public void queryUserByPageTest(){
        PageReqDTO pageReqDTO = new PageReqDTO();
        Result<PageResDTO<UserResDTO>> result = userService.queryUserByPage(pageReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void deleteUserTest(){
        UserReqDTO userReqDTO = new UserReqDTO();
        userReqDTO
                .setUserNo("1671783772776");
        Result<Boolean> result = userService.deleteUser(userReqDTO, "");
        log.info("result:{}", result);
    }

}
