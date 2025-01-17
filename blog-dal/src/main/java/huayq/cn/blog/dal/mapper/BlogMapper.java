package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.BlogDO;
import huayq.cn.blog.dal.model.BlogPageDO;
import huayq.cn.blog.dal.model.PageDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 博客表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Mapper
public interface BlogMapper{

    /**
     * 1.查询博客
     *
     * @param id       博客id
     * @return         BlogDO
     */
    BlogDO selectById (String id);

    /**
     * 2.新增博客
     *
     * @param blogDO       博客模型
     * @return             rowNum
     */
    int insert(BlogDO blogDO);

    /**
     * 3.修改博客
     *
     * @param blogDO       博客模型
     * @return             rowNum
     */
    int update(BlogDO blogDO);

    /**
     * 4.分页查询博客
     *
     * @param pageDO    博客分页模型
     * @return              博客集合
     */
    List<BlogDO> selectByPage(PageDO pageDO);

}
