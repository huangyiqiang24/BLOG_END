package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.PageDO;
import huayq.cn.blog.dal.model.UserDO;
import huayq.cn.blog.dal.model.UserPageDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Mapper
public interface UserMapper{
    /**
     * 1.查询用户
     *
     * @param id       用户id
     * @return         UserDO
     */
    UserDO selectById (String id);

    /**
     * 2.新增博客
     *
     * @param userDO       用户模型
     * @return             rowNum
     */
    int insert(UserDO userDO);

    /**
     * 3.修改博客
     *
     * @param userDO       用户模型
     * @return             rowNum
     */
    int update(UserDO userDO);

    /**
     * 4.分页查询用户信息
     *
     * @param pageDO    用户分页模型
     * @return              用户集合
     */
    List<UserDO> selectByPage(PageDO pageDO);

    /**
     * 5.删除用户
     *
     * @param id       用户id
     * @return         rowNum
     */
    int deleteById(String id);

}
