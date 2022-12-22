package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.PageDO;
import huayq.cn.blog.dal.model.TagDO;
import huayq.cn.blog.dal.model.TagPageDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Mapper
public interface TagMapper{

    /**
     * 1.查询标签
     *
     * @param id       标签id
     * @return         TagDO
     */
    TagDO selectById (String id);

    /**
     * 2.新增标签
     *
     * @param tagDO       标签模型
     * @return             rowNum
     */
    int insert(TagDO tagDO);

    /**
     * 3.修改标签
     *
     * @param tagDO       标签模型
     * @return            rowNum
     */
    int update(TagDO tagDO);

    /**
     * 4.分页查询标签信息
     *
     * @param pageDO     标签分页模型
     * @return              标签集合
     */
    List<TagDO> selectByPage (PageDO pageDO);

    /**
     * 5.删除标签
     *
     * @param id       标签id
     * @return         rowNum
     */
    int deleteById(String id);
}
