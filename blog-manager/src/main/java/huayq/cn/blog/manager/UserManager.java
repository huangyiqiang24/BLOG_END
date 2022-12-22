package huayq.cn.blog.manager;

import huayq.cn.blog.manager.model.PageBO;
import huayq.cn.blog.manager.model.UserBO;

import java.util.List;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
public interface UserManager {

    /**
     * 新增用户
     * @param userBO 用户新增BO
     * @return int 新增结果
     */
    int addUser(UserBO userBO);

    /**
     * 修改用户
     * @param userBO 用户修改BO
     * @return int 修改结果
     */
   int modifyUser(UserBO userBO);

    /**
     * 查询用户
     * @param id 用户编号
     * @return UserBO 查询结果
     */
    UserBO queryUserById(String id);

    /**
     * 分页查询用户
     * @return List<UserBO> 分页查询结果
     */
    List<UserBO> queryUserByPage(PageBO pageBO);

    /**
     * 删除用户
     * @param userBO 用户删除BO
     * @return int 删除结果
     */
    int deleteUser(UserBO userBO);


}
