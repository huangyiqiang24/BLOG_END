package huayq.cn.blog.manager.convert;

import huayq.cn.blog.dal.model.BlogDO;
import huayq.cn.blog.manager.model.BlogBO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class BlogConvert {

    public static BlogDO getBlogDO(BlogBO blogBO){
        BlogDO blogDO = new BlogDO();
        blogDO
                .setBlogNo(blogBO.getBlogNo())
                .setTitle(blogBO.getTitle())
                .setDescription(blogBO.getDescription())
                .setContent(blogBO.getContent())
                .setTag(blogBO.getTag())
                .setViews(blogBO.getViews());
        blogDO.setCreatedBy(blogBO.getCreatedBy());
        blogDO.setCreatedAt(blogBO.getCreatedAt());
        blogDO.setUpdatedAt(blogBO.getUpdatedAt());
        blogDO.setUpdatedBy(blogBO.getUpdatedBy());

        return blogDO;
    }

    public static BlogBO getBlogBO(BlogDO blogDO){
        BlogBO blogBO = new BlogBO();
        blogBO
                .setBlogNo(blogDO.getBlogNo())
                .setTitle(blogDO.getTitle())
                .setDescription(blogDO.getDescription())
                .setContent(blogDO.getContent())
                .setTag(blogDO.getTag())
                .setViews(blogDO.getViews());
        blogBO.setCreatedBy(blogDO.getCreatedBy());
        blogBO.setCreatedAt(blogDO.getCreatedAt());
        blogBO.setUpdatedAt(blogDO.getUpdatedAt());
        blogBO.setUpdatedBy(blogDO.getUpdatedBy());
        return blogBO;

    }

}
