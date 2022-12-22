package huayq.cn.blog.manager;

import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.manager.model.PageBO;

import java.util.List;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
public interface BlogManager {

    /**
     * 新增博客
     * @param blogBO 博客新增BO
     * @return int   新增结果
     */
    int addBlog(BlogBO blogBO);

    /**
     * 修改博客
     * @param blogBO 博客修改BO
     * @return int  修改结果
     */
    int modifyBlog(BlogBO blogBO);

    /**
     * 查询博客
     * @param id         博客编号
     * @return BlogBO   查询结果
     */
    BlogBO queryBlogById(String id);

    /**
     * 分页查询博客
     * @param pageBO    分页查询BO
     * @return List<BlogBO> 分页查询结果
     */
   List<BlogBO> queryBlogByPage(PageBO pageBO);



}
