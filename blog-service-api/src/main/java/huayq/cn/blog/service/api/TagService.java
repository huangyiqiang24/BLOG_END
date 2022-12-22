package huayq.cn.blog.service.api;


import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import huayq.cn.blog.service.api.model.tag.*;
import huayq.cn.blog.service.api.model.tag.result.TagResDTO;

/**
 *
 * @api     标签表 服务类
 * @author  huangyiqiang
 * @since   2022-12-19
 */
public interface TagService{

    /**
     * 新增标签
     * @param tagReqDTO 标签新增DTO
     * @param traceLogId 日志号
     * @return 新增结果
     */
    Result<Boolean> addTag(TagReqDTO tagReqDTO, String traceLogId);

    /**
     * 修改标签
     * @param tagReqDTO 标签修改DTO
     * @param traceLogId 日志号
     * @return 修改结果
     */
    Result<Boolean> modifyTag(TagReqDTO tagReqDTO, String traceLogId);

    /**
     * 查询标签
     * @param id 标签编号
     * @param traceLogId 日志号
     * @return 查询结果
     */
    Result<TagResDTO> queryTagById(String id, String traceLogId);

    /**
     * 分页查询标签
     * @param pageReqDTO 分页查询DTO
     * @param traceLogId 日志号
     * @return 分页查询结果
     */
    Result<PageResDTO<TagResDTO>> queryTagByPage(PageReqDTO pageReqDTO, String traceLogId);

    /**
     * 删除标签
     * @param tagReqDTO 标签删除DTO
     * @param traceLogId 日志号
     * @return 删除结果
     */
    Result<Boolean> deleteTag(TagReqDTO tagReqDTO, String traceLogId);

}
