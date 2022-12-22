package huayq.cn.blog.manager.convert;

import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.dal.model.UserDO;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.UserBO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class UserConvert {

    public static UserDO getUserDO(UserBO userBO){
        UserDO userDO = new UserDO();
        userDO
                .setUserNo(userBO.getUserNo())
                .setUsername(userBO.getUsername())
                .setPassword(userBO.getPassword())
                .setStatus(userBO.getStatus());
        userDO.setCreatedBy(userBO.getCreatedBy());
        userDO.setCreatedAt(userBO.getCreatedAt());
        userDO.setUpdatedAt(userBO.getUpdatedAt());
        userDO.setUpdatedBy(userBO.getUpdatedBy());
        return userDO;

    }

    public static UserBO getUserBO(UserDO userDO){
        UserBO userBO = new UserBO();
        userBO
                .setUserNo(userDO.getUserNo())
                .setUsername(userDO.getUsername())
                .setPassword(userDO.getPassword())
                .setStatus(userDO.getStatus());
        userBO.setCreatedBy(userDO.getCreatedBy());
        userBO.setCreatedAt(userDO.getCreatedAt());
        userBO.setUpdatedAt(userDO.getUpdatedAt());
        userBO.setUpdatedBy(userDO.getUpdatedBy());
        return userBO;

    }
}
