package huayq.cn.blog.service.api.model.tag.result;

import huayq.cn.blog.service.api.model.result.BaseResDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:32 2022/12/22
 */
@Setter
@Getter
@ToString(callSuper = true)
@Accessors(chain = true)
public class TagResDTO extends BaseResDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -2890781603270717547L;

    /**
     * 标签编号
     */
    private String tagNo;

    /**
     * 标签名
     */
    private String name;
}
