package huayq.cn.blog.service;

import huayq.cn.blog.manager.CommentManager;
import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.service.api.CommentService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.comment.*;
import huayq.cn.blog.service.api.model.comment.result.CommentResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.convert.BlogConvert.getBlogBO;
import static huayq.cn.blog.convert.BlogConvert.getBlogDTO;
import static huayq.cn.blog.convert.CommentConvert.getCommentBO;
import static huayq.cn.blog.convert.CommentConvert.getCommentDTO;
import static huayq.cn.blog.convert.PageConvert.getPageBO;


/**
 *
 * 评论表 服务实现类
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Slf4j
@DubboService
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentManager commentManager;

    @Override
    public Result<Boolean> addComment(CommentReqDTO commentReqDTO, String traceLogId) {
        try {
            CommentBO addCommentBO = getCommentBO(commentReqDTO);
            commentManager.addComment(addCommentBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<Boolean> modifyComment(CommentReqDTO commentReqDTO, String traceLogId) {
        try {
            CommentBO modifyCommentBO = getCommentBO(commentReqDTO);
            commentManager.modifyComment(modifyCommentBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<CommentResDTO> queryCommentById(String id, String traceLogId) {
        try {
            CommentBO commentBO = commentManager.queryCommentById(id);
            CommentResDTO commentDTO = getCommentDTO(commentBO);
            Result<CommentResDTO> result = new Result<>(commentDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<PageResDTO<CommentResDTO>> queryCommentByPage(PageReqDTO pageReqDTO, String traceLogId) {
        try {
            List<CommentBO> commentBOS = commentManager.queryCommentByPage(getPageBO(pageReqDTO));
            List<CommentResDTO> commentResDTOS = new ArrayList<>();
            for (CommentBO commentBO : commentBOS){
                commentResDTOS.add(getCommentDTO(commentBO));
            }
            PageResDTO<CommentResDTO> pageResDTO = new PageResDTO<>(commentResDTOS);
            Result<PageResDTO<CommentResDTO>> result = new Result<>(pageResDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<Boolean> deleteComment(CommentReqDTO commentReqDTO, String traceLogId) {
        try {
            commentManager.deleteComment(commentReqDTO.getCommentNo());
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }


    }
}
