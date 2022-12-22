package huayq.cn.blog.service;


import huayq.cn.blog.manager.UserManager;
import huayq.cn.blog.manager.model.TagBO;
import huayq.cn.blog.manager.model.UserBO;
import huayq.cn.blog.service.api.UserService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.comment.user.UserQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.comment.user.UserReqDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import huayq.cn.blog.service.api.model.comment.user.result.UserResDTO;
import huayq.cn.blog.service.api.model.tag.result.TagResDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.convert.PageConvert.getPageBO;
import static huayq.cn.blog.convert.TagConvert.getTagBO;
import static huayq.cn.blog.convert.TagConvert.getTagDTO;
import static huayq.cn.blog.convert.UserConvert.getUserBO;
import static huayq.cn.blog.convert.UserConvert.getUserDTO;

/**
 *
 * 用户表 服务实现类
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Slf4j
@DubboService
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserManager userManager;

    @Override
    public Result<Boolean> addUser(UserReqDTO userReqDTO, String traceLogId) {
        try {
            UserBO addUserBO = getUserBO(userReqDTO);
            userManager.addUser(addUserBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<Boolean> modifyUser(UserReqDTO userReqDTO, String traceLogId) {
        try {
            UserBO modifyUserBO = getUserBO(userReqDTO);
            userManager.modifyUser(modifyUserBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<UserResDTO> queryUserById(String id, String traceLogId) {
        try {

            UserBO userBO = userManager.queryUserById(id);
            UserResDTO userDTO = getUserDTO(userBO);
            Result<UserResDTO> result = new Result<>(userDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<PageResDTO<UserResDTO>> queryUserByPage(PageReqDTO pageReqDTO, String traceLogId) {
        try {
            List<UserBO> userBOS = userManager.queryUserByPage(getPageBO(pageReqDTO));
            List<UserResDTO> userResDTOS = new ArrayList<>();
            for (UserBO userBO : userBOS){
                userResDTOS.add(getUserDTO(userBO));
            }
            PageResDTO<UserResDTO> pageResDTO = new PageResDTO<>(userResDTOS);
            Result<PageResDTO<UserResDTO>> result = new Result<>(pageResDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<Boolean> deleteUser(UserReqDTO userReqDTO, String traceLogId) {
        try {
            UserBO deleteUserBO = getUserBO(userReqDTO);
            userManager.deleteUser(deleteUserBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }
}
