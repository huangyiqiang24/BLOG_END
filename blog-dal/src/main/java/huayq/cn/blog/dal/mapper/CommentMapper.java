package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.CommentDO;

/**
 * <p>
 * 评论表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
public interface CommentMapper{

    CommentDO selectById(int id);
}
