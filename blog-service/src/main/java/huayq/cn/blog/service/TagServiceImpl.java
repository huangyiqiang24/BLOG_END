package huayq.cn.blog.service;


import huayq.cn.blog.manager.TagManager;
import huayq.cn.blog.manager.model.CommentBO;
import huayq.cn.blog.manager.model.TagBO;
import huayq.cn.blog.service.api.TagService;
import huayq.cn.blog.service.api.model.PageReqDTO;
import huayq.cn.blog.service.api.model.comment.result.CommentResDTO;
import huayq.cn.blog.service.api.model.result.PageResDTO;
import huayq.cn.blog.service.api.model.result.Result;
import huayq.cn.blog.service.api.model.tag.*;
import huayq.cn.blog.service.api.model.tag.result.TagResDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

import static huayq.cn.blog.convert.CommentConvert.getCommentBO;
import static huayq.cn.blog.convert.CommentConvert.getCommentDTO;
import static huayq.cn.blog.convert.PageConvert.getPageBO;
import static huayq.cn.blog.convert.TagConvert.getTagBO;
import static huayq.cn.blog.convert.TagConvert.getTagDTO;

/**
 *
 * 标签表 服务实现类
 * @author huangyiqiang
 * @since 2022-12-19
 */
@Slf4j
@DubboService
public class TagServiceImpl implements TagService {
    @Autowired
    private TagManager tagManager;

    @Override
    public Result<Boolean> addTag(TagReqDTO tagReqDTO, String traceLogId) {
        try {
            TagBO addTagBO = getTagBO(tagReqDTO);
            tagManager.addTag(addTagBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<Boolean> modifyTag(TagReqDTO tagReqDTO, String traceLogId) {
        try {
            TagBO modifyTagBO = getTagBO(tagReqDTO);
            tagManager.modifyTag(modifyTagBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<TagResDTO> queryTagById(String id, String traceLogId) {
        try {

            TagBO tagBO = tagManager.queryTagById(id);
            TagResDTO tagDTO = getTagDTO(tagBO);
            Result<TagResDTO> result = new Result<>(tagDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }

    @Override
    public Result<PageResDTO<TagResDTO>> queryTagByPage(PageReqDTO pageReqDTO, String traceLogId) {

        try {
            List<TagBO> tagBOS = tagManager.queryTagByPage(getPageBO(pageReqDTO));
            List<TagResDTO> tagResDTOS = new ArrayList<>();
            for (TagBO tagBO : tagBOS){
                tagResDTOS.add(getTagDTO(tagBO));
            }
            PageResDTO<TagResDTO> pageResDTO = new PageResDTO<>(tagResDTOS);
            Result<PageResDTO<TagResDTO>> result = new Result<>(pageResDTO);
            return result;
        }catch (Exception e){
            return new Result<>();
        }


    }

    @Override
    public Result<Boolean> deleteTag(TagReqDTO tagReqDTO, String traceLogId) {
        try {
            TagBO deleteTagBO = getTagBO(tagReqDTO);
            tagManager.deleteTag(deleteTagBO);
            Result<Boolean> result = new Result<>(true);
            return result;
        }catch (Exception e){
            return new Result<>();
        }
    }
}
