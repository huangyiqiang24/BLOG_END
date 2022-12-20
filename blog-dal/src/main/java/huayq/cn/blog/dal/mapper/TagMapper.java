package huayq.cn.blog.dal.mapper;


import huayq.cn.blog.dal.model.TagDO;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
public interface TagMapper{
    TagDO selectById(int id);
}
