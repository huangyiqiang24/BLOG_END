package test;

import huayq.cn.blog.ServiceApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApplication.class)
@MapperScan(value = "huayq.cn.blog.dal.mapper")
@Slf4j
public class BaseApplicationTest {

    @Test
    public void contextLoads() {
    }

}
