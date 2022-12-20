package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.UserDO;
import org.apache.ibatis.annotations.Mapper;


/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */

public interface UserMapper{
//    void insert (UserDO userDO);

    UserDO selectById(int id);
}
