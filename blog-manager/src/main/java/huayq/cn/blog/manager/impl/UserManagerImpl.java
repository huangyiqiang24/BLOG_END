package huayq.cn.blog.manager.impl;

import huayq.cn.blog.dal.mapper.UserMapper;
import huayq.cn.blog.dal.model.UserDO;
import huayq.cn.blog.manager.UserManager;
import huayq.cn.blog.manager.model.PageBO;
import huayq.cn.blog.manager.model.UserBO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.manager.convert.PageConvert.getPageDO;
import static huayq.cn.blog.manager.convert.UserConvert.getUserBO;
import static huayq.cn.blog.manager.convert.UserConvert.getUserDO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
@Service
@Slf4j
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(UserBO userBO) {
        userMapper.insert(getUserDO(userBO));
    }

    @Override
    public void modifyUser(UserBO userBO) {
        UserDO userDO = getUserDO(userBO);
        userMapper.update(userDO);
    }

    @Override
    public UserBO queryUserById(String id) {
        return getUserBO(userMapper.selectById(id));
    }

    @Override
    public List<UserBO> queryUserByPage(PageBO pageBO) {
        List<UserDO> userDOS = userMapper.selectByPage(getPageDO(pageBO));
        ArrayList<UserBO> userBOS = new ArrayList<>();
        for (UserDO userDO : userDOS){
            userBOS.add(getUserBO(userDO));
        }
        return userBOS;
    }

    @Override
    public void deleteUser(String userNo) {
        userMapper.deleteById(userNo);
    }
}
