package huayq.cn.blog.manager.impl;

import huayq.cn.blog.dal.mapper.BlogMapper;
import huayq.cn.blog.dal.model.BlogDO;
import huayq.cn.blog.manager.BlogManager;
import huayq.cn.blog.manager.model.BlogBO;
import huayq.cn.blog.manager.model.PageBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.manager.convert.BlogConvert.getBlogBO;
import static huayq.cn.blog.manager.convert.BlogConvert.getBlogDO;
import static huayq.cn.blog.manager.convert.PageConvert.getPageDO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:16 2022/12/22
 */
@Service
public class BlogManagerImpl implements BlogManager {

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int addBlog(BlogBO blogBO) {

        BlogDO blogDO = getBlogDO(blogBO);
        int insert = blogMapper.insert(blogDO);
        return insert;
    }

    @Override
    public int modifyBlog(BlogBO blogBO) {
        BlogDO blogDO = getBlogDO(blogBO);
        int update = blogMapper.update(blogDO);
        return update;
    }

    @Override
    public BlogBO queryBlogById(String id) {
        BlogDO blogDO = blogMapper.selectById(id);
        BlogBO blogBO = getBlogBO(blogDO);
        return blogBO;
    }

    @Override
    public List<BlogBO> queryBlogByPage(PageBO pageBO) {
        List<BlogDO> blogDOS = blogMapper.selectByPage(getPageDO(pageBO));
        ArrayList<BlogBO> blogBOS = new ArrayList<>();
        for (BlogDO blogDO : blogDOS){
            blogBOS.add(getBlogBO(blogDO));
        }
        return blogBOS;
    }
}
