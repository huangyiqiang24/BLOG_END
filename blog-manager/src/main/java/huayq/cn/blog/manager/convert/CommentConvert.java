package huayq.cn.blog.manager.convert;

import huayq.cn.blog.dal.model.CommentDO;
import huayq.cn.blog.manager.model.CommentBO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class CommentConvert {
    public static CommentDO getCommentDO(CommentBO commentBO){
        CommentDO commentDO = new CommentDO();
        commentDO
                .setCommentNo(commentBO.getCommentNo())
                .setParentComment(commentBO.getParentComment())
                .setNickname(commentBO.getNickname())
                .setContent(commentBO.getContent());
        commentDO.setCreatedBy(commentBO.getCreatedBy());
        commentDO.setCreatedAt(commentBO.getCreatedAt());
        commentDO.setUpdatedAt(commentBO.getUpdatedAt());
        commentDO.setUpdatedBy(commentBO.getUpdatedBy());

        return commentDO;
    }

    public static CommentBO getCommentBO(CommentDO commentDO){

        CommentBO commentBO = new CommentBO();
        commentBO
                .setCommentNo(commentDO.getCommentNo())
                .setParentComment(commentDO.getParentComment())
                .setNickname(commentDO.getNickname())
                .setContent(commentDO.getContent());
        commentBO.setCreatedBy(commentDO.getCreatedBy());
        commentBO.setCreatedAt(commentDO.getCreatedAt());
        commentBO.setUpdatedAt(commentDO.getUpdatedAt());
        commentBO.setUpdatedBy(commentDO.getUpdatedBy());

        return commentBO;

    }
}
