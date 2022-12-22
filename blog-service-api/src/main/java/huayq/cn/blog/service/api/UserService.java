package huayq.cn.blog.service.api;


import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.comment.user.UserQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.comment.user.UserReqDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import huayq.cn.blog.service.api.model.comment.user.result.UserResDTO;

/**
 *
 * @api     用户服务类
 * @author  huangyiqiang
 * @since   2022-12-19
 */
public interface UserService{

    /**
     * 新增用户
     * @param userReqDTO 用户新增DTO
     * @param traceLogId 日志号
     * @return 新增结果
     */
    Result<Boolean> addUser(UserReqDTO userReqDTO, String traceLogId);

    /**
     * 修改用户
     * @param userReqDTO 用户修改DTO
     * @param traceLogId 日志号
     * @return 修改结果
     */
    Result<Boolean> modifyUser(UserReqDTO userReqDTO, String traceLogId);

    /**
     * 查询用户
     * @param id 用户编号
     * @param traceLogId 日志号
     * @return 查询结果
     */
    Result<UserResDTO> queryUserById(String id, String traceLogId);

    /**
     * 分页查询用户
     * @param pageReqDTO 分页查询用户DTO
     * @param traceLogId 日志号
     * @return 分页查询结果
     */
    Result<PageResDTO<UserResDTO>> queryUserByPage(PageReqDTO pageReqDTO, String traceLogId);

    /**
     * 删除用户
     * @param userReqDTO 用户删除DTO
     * @param traceLogId 日志号
     * @return 删除结果
     */
    Result<Boolean> deleteUser(UserReqDTO userReqDTO, String traceLogId);


}
