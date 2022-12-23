package huayq.cn.blog.convert;


import huayq.cn.blog.manager.model.TagBO;
import huayq.cn.blog.service.api.model.tag.TagQueryByPageReqDTO;
import huayq.cn.blog.service.api.model.tag.TagReqDTO;
import huayq.cn.blog.service.api.model.tag.result.TagResDTO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:36 2022/12/22
 */
public class TagConvert {

    public static TagBO getTagBO(TagReqDTO tagReqDTO){
        TagBO tagBO = new TagBO();

        if (tagReqDTO.getTagNo() == null){
            //新增
            tagBO.setTagNo(String.valueOf(System.currentTimeMillis()));
            tagBO.setCreatedBy(tagReqDTO.getOperator());
        }else {
            //修改
            tagBO.setTagNo(tagReqDTO.getTagNo());
            tagBO.setUpdatedBy(tagReqDTO.getOperator());
        }

        tagBO.setName(tagReqDTO.getName());

        return tagBO;
    }

    public static TagBO getTagBO(TagQueryByPageReqDTO tagQueryByPageReqDTO){
        TagBO tagBO = new TagBO();

        return tagBO;
    }

    public static TagResDTO getTagDTO(TagBO tagBO){
        TagResDTO tagResDTO = new TagResDTO();
        tagResDTO
                .setTagNo(tagBO.getTagNo())
                .setName(tagBO.getName());
        tagResDTO.setCreatedAt(tagBO.getCreatedAt());
        tagResDTO.setCreatedBy(tagBO.getCreatedBy());
        tagResDTO.setUpdatedAt(tagBO.getUpdatedAt());
        tagResDTO.setUpdatedBy(tagBO.getUpdatedBy());
        return tagResDTO;
    }


}




