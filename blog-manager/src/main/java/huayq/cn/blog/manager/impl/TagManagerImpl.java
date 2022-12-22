package huayq.cn.blog.manager.impl;

import huayq.cn.blog.dal.mapper.TagMapper;
import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.dal.model.TagDO;
import huayq.cn.blog.manager.TagManager;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.PageBO;
import huayq.cn.blog.manager.model.TagBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.manager.convert.CommentConvert.getCommentBO;
import static huayq.cn.blog.manager.convert.PageConvert.getPageDO;
import static huayq.cn.blog.manager.convert.TagConvert.getTagBO;
import static huayq.cn.blog.manager.convert.TagConvert.getTagDO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
@Service
public class TagManagerImpl implements TagManager {

    @Autowired
    private TagMapper tagMapper;
    @Override
    public int addTag(TagBO tagBO) {
        return tagMapper.insert(getTagDO(tagBO));
    }

    @Override
    public int modifyTag(TagBO tagBO) {
        return tagMapper.update(getTagDO(tagBO));
    }

    @Override
    public TagBO queryTagById(String id) {
        return getTagBO(tagMapper.selectById(id));
    }

    @Override
    public List<TagBO> queryTagByPage(PageBO pageBO) {
        List<TagDO> tagDOS = tagMapper.selectByPage(getPageDO(pageBO));
        ArrayList<TagBO> tagBOS = new ArrayList<>();
        for (TagDO tagDO : tagDOS){
            tagBOS.add(getTagBO(tagDO));
        }
        return tagBOS;
    }

    @Override
    public int deleteTag(TagBO tagBO) {
        return tagMapper.deleteById(getTagDO(tagBO).getTagNo());
    }
}
