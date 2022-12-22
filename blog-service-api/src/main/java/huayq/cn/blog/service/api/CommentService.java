package huayq.cn.blog.service.api;


import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.comment.*;
import huayq.cn.blog.service.api.model.comment.result.CommentResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;

/**
 *
 * @api     评论表 服务类
 * @author  huangyiqiang
 * @since   2022-12-19
 */
public interface CommentService {

    /**
     * 新增评论
     * @param commentReqDTO 评论新增DTO
     * @param traceLogId 日志号
     * @return 新增结果
     */
    Result<Boolean> addComment(CommentReqDTO commentReqDTO, String traceLogId);

    /**
     * 修改评论
     * @param commentReqDTO 评论修改DTO
     * @param traceLogId 日志号
     * @return 修改结果
     */
    Result<Boolean> modifyComment(CommentReqDTO commentReqDTO, String traceLogId);

    /**
     * 查询评论
     * @param id          评论编号
     * @param traceLogId 日志号
     * @return 查询结果
     */
    Result<CommentResDTO> queryCommentById(String id, String traceLogId);

    /**
     * 分页查询评论
     * @param pageReqDTO 分页查询DTO
     * @param traceLogId 日志号
     * @return 分页查询结果
     */
    Result<PageResDTO<CommentResDTO>> queryCommentByPage(PageReqDTO pageReqDTO, String traceLogId);

    /**
     * 删除评论
     * @param commentReqDTO 评论删除DTO
     * @param traceLogId 日志号
     * @return 删除结果
     */
    Result<Boolean> deleteComment(CommentReqDTO commentReqDTO, String traceLogId);

}
