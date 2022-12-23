package huayq.cn.blog.convert;

import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.service.api.model.comment.CommentQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.comment.CommentReqDTO;
import huayq.cn.blog.service.api.model.comment.result.CommentResDTO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class CommentConvert {

    public static CommentBO getCommentBO(CommentReqDTO commentReqDTO){
        CommentBO commentBO = new CommentBO();

        if (commentReqDTO.getCommentNo() == null){
            //新增
            commentBO.setCommentNo(String.valueOf(System.currentTimeMillis()));
            commentBO.setCreatedBy(commentReqDTO.getOperator());
        }else {
            //修改
            commentBO.setCommentNo(commentReqDTO.getCommentNo());
            commentBO.setUpdatedBy(commentReqDTO.getOperator());
        }

        commentBO
                .setContent(commentReqDTO.getContent())
                .setParentComment(commentReqDTO.getParentComment())
                .setNickname(commentReqDTO.getNickname());

        return commentBO;
    }

    public static CommentBO getCommentBO(CommentQueryByPageReqDTO commentQueryByPageReqDTO){
        CommentBO commentBO = new CommentBO();

        return commentBO;
    }

    public static CommentResDTO getCommentDTO(CommentBO commentBO){
        CommentResDTO commentResDTO = new CommentResDTO();
        commentResDTO
                .setCommentNo(commentBO.getCommentNo())
                .setParentComment(commentBO.getParentComment())
                .setNickname(commentBO.getNickname())
                .setContent(commentBO.getContent());

        commentResDTO.setCreatedAt(commentBO.getCreatedAt());
        commentResDTO.setCreatedBy(commentBO.getCreatedBy());
        commentResDTO.setUpdatedAt(commentBO.getUpdatedAt());
        commentResDTO.setUpdatedBy(commentBO.getUpdatedBy());
        return commentResDTO;
    }


}
