package huayq.cn.blog.convert;


import huayq.cn.blog.manager.model.UserBO;
import huayq.cn.blog.service.api.model.comment.user.UserQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.comment.user.UserReqDTO;
import huayq.cn.blog.service.api.model.comment.user.result.UserResDTO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class UserConvert {

    public static UserBO getUserBO(UserReqDTO userReqDTO){
        UserBO userBO = new UserBO();

        if (userReqDTO.getUserNo() == null){
            //新增
            userBO.setUserNo(String.valueOf(System.currentTimeMillis()));
            userBO.setCreatedBy(userReqDTO.getOperator());
        }else {
            //修改
            userBO.setUserNo(userReqDTO.getUserNo());
            userBO.setUpdatedBy(userReqDTO.getOperator());
        }

        userBO
                .setUsername(userReqDTO.getUsername())
                .setPassword(userReqDTO.getPassword())
                .setStatus(userReqDTO.getStatus());

        return userBO;
    }

    public static UserBO getUserBO(UserQueryByPageReqDTO userQueryByPageReqDTO){
        UserBO userBO = new UserBO();

        return userBO;
    }

    public static UserResDTO getUserDTO(UserBO userBO){
        UserResDTO userResDTO = new UserResDTO();
        userResDTO
                .setUserNo(userBO.getUserNo())
                .setUsername(userBO.getUsername())
                .setPassword(userBO.getPassword())
                .setStatus(userBO.getStatus());
        userResDTO.setCreatedAt(userBO.getCreatedAt());
        userResDTO.setCreatedBy(userBO.getCreatedBy());
        userResDTO.setUpdatedAt(userBO.getUpdatedAt());
        userResDTO.setUpdatedBy(userBO.getUpdatedBy());
        return userResDTO;
    }


}
