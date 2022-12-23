package huayq.cn.blog.manager;

import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.PageBO;

import java.util.List;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
public interface CommentManager {

    /**
     * 新增评论
     * @param commentBO 评论新增BO
     * @return int      新增结果
     */
    int addComment(CommentBO commentBO);

    /**
     * 修改评论
     * @param commentBO 评论修改BO
     * @return int      修改结果
     */
    int modifyComment(CommentBO commentBO);

    /**
     * 查询评论
     * @param id          评论编号
     * @return  CommentBO 查询结果
     */
    CommentBO queryCommentById(String id);

    /**
     * 分页查询评论
     * @return List<CommentBO> 分页查询结果
     */
    List<CommentBO> queryCommentByPage(PageBO pageBO);

    /**
     * 删除评论
     * @param commentNo 评论删除BO
     * @return int 删除结果
     */
    int deleteComment(String commentNo);



}
