package huayq.cn.blog.manager.impl;

import huayq.cn.blog.dal.mapper.CommentMapper;
import huayq.cn.blog.dal.model.BlogDO;
import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.manager.CommentManager;
import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.PageBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import static huayq.cn.blog.manager.convert.BlogConvert.getBlogBO;
import static huayq.cn.blog.manager.convert.CommentConvert.getCommentBO;
import static huayq.cn.blog.manager.convert.CommentConvert.getCommentDO;
import static huayq.cn.blog.manager.convert.PageConvert.getPageDO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
@Service
public class CommentManagerImpl implements CommentManager {

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public int addComment(CommentBO commentBO) {
        CommentDO commentDO = getCommentDO(commentBO);
        return commentMapper.insert(commentDO);
    }

    @Override
    public int modifyComment(CommentBO commentBO) {
        CommentDO commentDO = getCommentDO(commentBO);
        return commentMapper.update(commentDO);
    }

    @Override
    public CommentBO queryCommentById(String id) {
        return getCommentBO(commentMapper.selectById(id));
    }

    @Override
    public List<CommentBO> queryCommentByPage(PageBO pageBO) {
        List<CommentDO> commentDOS = commentMapper.selectByPage(getPageDO(pageBO));
        ArrayList<CommentBO> commentBOS = new ArrayList<>();
        for (CommentDO CommentDO : commentDOS){
            commentBOS.add(getCommentBO(CommentDO));
        }
        return commentBOS;
    }

    @Override
    public int deleteComment(CommentBO commentBO) {
        CommentDO commentDO = getCommentDO(commentBO);
        return commentMapper.deleteById(commentDO.getCommentNo());
    }
}
