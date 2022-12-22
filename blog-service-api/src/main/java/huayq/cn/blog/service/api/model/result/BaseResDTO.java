package huayq.cn.blog.service.api.model.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 13:57 2022/12/22
 */
@Setter
@Getter
@ToString
public class BaseResDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -8533545044438784372L;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 创建人
     */
    private String createdBy;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 更新人
     */
    private String updatedBy;
}
