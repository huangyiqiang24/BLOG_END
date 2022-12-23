package test.service;

import huayq.cn.blog.service.api.BlogService;
import huayq.cn.blog.service.api.CommentService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.comment.CommentReqDTO;
import huayq.cn.blog.service.api.model.comment.result.CommentResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseApplicationTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 20:18 2022/12/22
 */
@Slf4j
public class CommentServiceTest extends BaseApplicationTest {

    @Autowired
    CommentService commentService;

    @Test
    public void addCommentTest(){
        CommentReqDTO commentReqDTO = new CommentReqDTO();
        commentReqDTO
                .setContent("1")
                .setOperator("hyq")
                .setNickname("hahaha");

        Result<Boolean> result = commentService.addComment(commentReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void modifyCommentTest(){
        CommentReqDTO commentReqDTO = new CommentReqDTO();
        commentReqDTO
                .setCommentNo("1671788252947")
                .setContent("content")
                .setOperator("hyq")
                .setNickname("hahaha");

        Result<Boolean> result = commentService.modifyComment(commentReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void queryBlogTest(){
        Result<CommentResDTO> result = commentService.queryCommentById("1671788252947", "");
        log.info("result:{}", result);
    }

    @Test
    public void queryBlogByPageTest(){
        PageReqDTO pageReqDTO = new PageReqDTO();
        Result<PageResDTO<CommentResDTO>> result = commentService.queryCommentByPage(pageReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void deleteCommentTest(){

        CommentReqDTO commentReqDTO = new CommentReqDTO();
        commentReqDTO
                .setCommentNo("1671788344526");
        Result<Boolean> result = commentService.deleteComment(commentReqDTO, "");
        log.info("result:{}", result);

    }

}
