package huayq.cn.blog.manager;

import huayq.cn.blog.manager.model.PageBO;
import huayq.cn.blog.manager.model.TagBO;

import java.util.List;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
public interface TagManager {

    /**
     * 新增标签
     * @param tagBO 标签新增BO
     * @return int  新增结果
     */
    int addTag(TagBO tagBO);

    /**
     * 修改标签
     * @param tagBO 标签修改BO
     * @return int  修改结果
     */
    int modifyTag(TagBO tagBO);

    /**
     * 查询标签
     * @param id 标签编号
     * @return TagBO 查询结果
     */
    TagBO queryTagById(String id);

    /**
     * 分页查询标签
     * @return List<TagBO> 分页查询结果
     */
    List<TagBO> queryTagByPage(PageBO pageBO);

    /**
     * 删除标签
     * @param tagNo 标签删除BO
     * @return int  删除结果
     */
    int deleteTag(String tagNo);


}
