package huayq.cn.blog.service.api;


import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.blog.BlogReqDTO;
import huayq.cn.blog.service.api.model.blog.result.BlogResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;

/**
 *
 * @api     博客表 服务类
 * @author  huangyiqiang
 * @since   2022-12-19
 */
public interface BlogService {

    /**
     * 新增博客
     * @param blogReqDTO 博客新增DTO
     * @param traceLogId 日志号
     * @return 新增结果
     */
    Result<Boolean> addBlog(BlogReqDTO blogReqDTO, String traceLogId);

    /**
     * 修改博客
     * @param blogReqDTO 博客修改DTO
     * @param traceLogId 日志号
     * @return 修改结果
     */
    Result<Boolean> modifyBlog(BlogReqDTO blogReqDTO, String traceLogId);

    /**
     * 查询博客
     * @param id         博客编号
     * @param traceLogId 日志号
     * @return 查询结果
     */
    Result<BlogResDTO> queryBlogById(String id, String traceLogId);

    /**
     * 分页查询博客
     * @param pageReqDTO 分页查询DTO
     * @param traceLogId 日志号
     * @return 分页查询结果
     */
    Result<PageResDTO<BlogResDTO>> queryBlogByPage(PageReqDTO pageReqDTO, String traceLogId);

}
