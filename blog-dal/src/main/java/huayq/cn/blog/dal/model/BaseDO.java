package huayq.cn.blog.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:43 2022/12/20
 */

@Getter
@Setter
@ToString
public class BaseDO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 1817691933124926299L;

    /**
     * 主键ID
     */
    private Long id;

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
