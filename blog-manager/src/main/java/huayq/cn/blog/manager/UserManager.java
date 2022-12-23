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
     *
     * @param userBO 用户新增BO
     */
    void addUser(UserBO userBO);

    /**
     * 修改用户
     *
     * @param userBO 用户修改BO
     */
   void modifyUser(UserBO userBO);

    /**
     * 查询用户
     * @param id 用户编号
     * @return UserBO 查询结果
     */
    UserBO queryUserById(String id);

    /**
     * 分页查询用户
     *  @param pageBO 分页查询BO
     * @return List<UserBO> 分页查询结果
     */
    List<UserBO> queryUserByPage(PageBO pageBO);

    /**
     * 删除用户
     *
     * @param userNo 删除用户的userNo
     */
    void deleteUser(String userNo);


}
