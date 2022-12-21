package test.mapper;

import huayq.cn.blog.dal.mapper.UserMapper;
import huayq.cn.blog.dal.model.UserDO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseApplicationTest;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 15:19 2022/12/20
 */
@Slf4j
public class MapperTest  extends BaseApplicationTest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void testUserMapper(){
        UserDO userDO = userMapper.selectById(1);
        log.info("userDo:{}", userDO);
    }
}
