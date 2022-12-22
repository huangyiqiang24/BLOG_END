package huayq.cn.blog.manager.convert;

import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.dal.model.TagDO;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.TagBO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class TagConvert {

    public static TagDO getTagDO(TagBO tagBO){
        TagDO tagDO = new TagDO();
        tagDO
                .setTagNo(tagBO.getTagNo())
                .setName(tagBO.getName());
        tagDO.setCreatedBy(tagBO.getCreatedBy());
        tagDO.setCreatedAt(tagBO.getCreatedAt());
        tagDO.setUpdatedAt(tagBO.getUpdatedAt());
        tagDO.setUpdatedBy(tagBO.getUpdatedBy());
        return tagDO;
    }

    public static TagBO getTagBO(TagDO tagDO){

        TagBO tagBO = new TagBO();
        tagBO
                .setTagNo(tagDO.getTagNo())
                .setName(tagDO.getName());
        tagBO.setCreatedBy(tagDO.getCreatedBy());
        tagBO.setCreatedAt(tagDO.getCreatedAt());
        tagBO.setUpdatedAt(tagDO.getUpdatedAt());
        tagBO.setUpdatedBy(tagDO.getUpdatedBy());
        return tagBO;
    }

}
