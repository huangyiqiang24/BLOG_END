package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.BlogDO;

/**
 * <p>
 * 博客表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
public interface BlogMapper{

    BlogDO selectById (int id);

}
