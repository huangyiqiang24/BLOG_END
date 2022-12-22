package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.dal.model.CommentPageDO;
import huayq.cn.blog.dal.model.PageDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Mapper
public interface CommentMapper{
    /**
     * 1.查询评论
     *
     * @param id       评论id
     * @return         CommentDO
     */
    CommentDO selectById (String id);

    /**
     * 2.新增评论
     *
     * @param commentDO    评论模型
     * @return             rowNum
     */
    int insert(CommentDO commentDO);

    /**
     * 3.修改评论
     *
     * @param commentDO    评论模型
     * @return             rowNum
     */
    int update(CommentDO commentDO);

    /**
     * 4.分页查询评论信息
     *
     * @param pageDO  评论分页模型
     * @return              评论集合
     */
    List<CommentDO> selectByPage (PageDO pageDO);

    /**
     * 5.删除评论
     *
     * @param id       评论id
     * @return         rowNum
     */
    int deleteById(String id);
}
