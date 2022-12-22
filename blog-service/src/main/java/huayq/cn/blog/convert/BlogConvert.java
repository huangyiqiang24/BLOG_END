package huayq.cn.blog.convert;

import huayq.cn.blog.manager.model.BaseBO;
import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.service.api.model.blog.BlogQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class BlogConvert {

    public static BlogBO getBlogBO(BlogReqDTO blogReqDTO){
        BlogBO blogBO = new BlogBO();
        blogBO
                .setBlogNo("123")
                .setContent(blogReqDTO.getContent())
                .setDescription(blogReqDTO.getDescription())
                .setTitle(blogReqDTO.getTitle())
                .setTag(blogReqDTO.getTag())
                .setViews(blogReqDTO.getViews())
                .setCreatedBy(blogReqDTO.getOperator());
        return blogBO;
    }

    public static BlogBO getBlogBO(BlogQueryByPageReqDTO blogQueryByPageReqDTO){
        BlogBO blogBO = new BlogBO();



        return blogBO;
    }

    public static BlogResDTO getBlogDTO(BlogBO blogBO){
        BlogResDTO blogResDTO = new BlogResDTO();
        blogResDTO
                .setBlogNo(blogBO.getBlogNo())
                .setContent(blogBO.getContent())
                .setDescription(blogBO.getDescription())
                .setTag(blogBO.getTag())
                .setViews(blogBO.getViews())
                .setTitle(blogBO.getTitle());
        blogResDTO.setCreatedAt(blogBO.getCreatedAt());
        blogResDTO.setCreatedBy(blogBO.getCreatedBy());
        blogResDTO.setUpdatedAt(blogBO.getUpdatedAt());
        blogResDTO.setUpdatedBy(blogBO.getUpdatedBy());
        return blogResDTO;
    }


}
