package test.service;

import huayq.cn.blog.service.api.BlogService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.util.DateUtil;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.BaseApplicationTest;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 20:18 2022/12/22
 */
@Slf4j
public class BlogServiceTest extends BaseApplicationTest {

    @Autowired
    BlogService blogService;

    @Test
    public void addBlogTest(){
        BlogReqDTO blogReqDTO = new BlogReqDTO();
        blogReqDTO
                .setTitle("tittle"+String.valueOf(System.currentTimeMillis()))
                .setDescription("desc1")
                .setContent("content")
                .setTag("tag")
                .setViews(1)
                .setOperator("operator1");
        Result<Boolean> result = blogService.addBlog(blogReqDTO,"");
        log.info("result:{}", result);
    }

    @Test
    public void modifyBlogTest(){
        BlogReqDTO blogReqDTO = new BlogReqDTO();
        blogReqDTO
                .setBlogNo("1671779585494")
                .setTitle("tittle11")
                .setDescription("desc1")

                .setContent("content")
                .setTag("tag")
                .setViews(1)
                .setOperator("operator1");
        Result<Boolean> result = blogService.modifyBlog(blogReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void queryBlogTest(){
        Result<BlogResDTO> result = blogService.queryBlogById("1671779585494", "");
        log.info("result:{}", result);
    }

    @Test
    public void queryBlogByPageTest(){
        PageReqDTO pageReqDTO = new PageReqDTO();
        Result<PageResDTO<BlogResDTO>> result = blogService.queryBlogByPage(pageReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void test(){
        //时间戳测试
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(format);
        System.out.println(new Date().getTime());
        log.error(String.valueOf(new Date().getTime()));

    }

}
