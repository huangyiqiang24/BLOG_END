package test.service;

import huayq.cn.blog.service.api.BlogService;
import huayq.cn.blog.service.api.TagService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import huayq.cn.blog.service.api.model.tag.TagReqDTO;
import huayq.cn.blog.service.api.model.tag.result.TagResDTO;
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
public class TagServiceTest extends BaseApplicationTest {

    @Autowired
    TagService tagService;

    @Test
    public void addTagTest(){
        TagReqDTO tagReqDTO = new TagReqDTO();
        tagReqDTO
                .setName("1")
                .setOperator("hyq");
        Result<Boolean> result = tagService.addTag(tagReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void modifyTagTest(){
        TagReqDTO tagReqDTO = new TagReqDTO();
        tagReqDTO
                .setTagNo("1671787470322")
                .setName("spring1")
                .setOperator("hyq");
        Result<Boolean> result = tagService.modifyTag(tagReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void queryTagTest(){
        Result<TagResDTO> result = tagService.queryTagById("1671787470322", "");
        log.info("result:{}", result);
    }

    @Test
    public void queryTagByPageTest(){
        PageReqDTO pageReqDTO = new PageReqDTO();
        Result<PageResDTO<TagResDTO>> result = tagService.queryTagByPage(pageReqDTO, "");
        log.info("result:{}", result);
    }

    @Test
    public void deleteTagTest(){
        TagReqDTO tagReqDTO = new TagReqDTO();
        tagReqDTO
                .setTagNo("1671787571110");
        Result<Boolean> result = tagService.deleteTag(tagReqDTO, "");
        log.info("result:{}", result);

    }

}
