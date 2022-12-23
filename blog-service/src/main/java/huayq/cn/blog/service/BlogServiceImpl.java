package huayq.cn.blog.service;


import com.sun.xml.internal.ws.developer.Serialization;
import huayq.cn.blog.manager.BlogManager;
import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.service.api.BlogService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.*;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import static huayq.cn.blog.convert.BlogConvert.getBlogBO;
import static huayq.cn.blog.convert.BlogConvert.getBlogDTO;
import static huayq.cn.blog.convert.PageConvert.getPageBO;


/**
 *
 * 博客表 服务实现类
 * @author huangyiqiang
 * @since 2022-12-19
 */
@DubboService
@Slf4j
public class BlogServiceImpl implements BlogService {

    @Autowired
    private BlogManager blogManager;

    @Override
    public Result<Boolean> addBlog(BlogReqDTO blogReqDTO, String traceLogId) {


            BlogBO addBlogBO = getBlogBO(blogReqDTO);
            blogManager.addBlog(addBlogBO);
            Result<Boolean> result = new Result<>(true);
            return result;

    }

    @Override
    public Result<Boolean> modifyBlog(BlogReqDTO blogReqDTO, String traceLogId) {

//        try {
            BlogBO modifyBlogBO = getBlogBO(blogReqDTO);
            blogManager.modifyBlog(modifyBlogBO);
            Result<Boolean> result = new Result<>(true);
            return result;
//        }catch (Exception e){
//            return new Result<>();
//        }

    }

    @Override
    public Result<BlogResDTO> queryBlogById(String id, String traceLogId) {

        try {
            BlogBO queryBlog = blogManager.queryBlogById(id);
            BlogResDTO blogDTO = getBlogDTO(queryBlog);
            Result<BlogResDTO> result = new Result<>(blogDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<PageResDTO<BlogResDTO>> queryBlogByPage(PageReqDTO pageReqDTO, String traceLogId) {

//        try {
            List<BlogBO> blogBOS = blogManager.queryBlogByPage(getPageBO(pageReqDTO));
            List<BlogResDTO> blogResDTOS = new ArrayList<>();
            for (BlogBO blogBO : blogBOS){
                blogResDTOS.add(getBlogDTO(blogBO));
            }
            PageResDTO<BlogResDTO> pageResDTO = new PageResDTO<>(blogResDTOS);
            Result<PageResDTO<BlogResDTO>> result = new Result<>(pageResDTO);
            return result;
//        }catch (Exception e){
//            return new Result<>();
//        }

    }
}
