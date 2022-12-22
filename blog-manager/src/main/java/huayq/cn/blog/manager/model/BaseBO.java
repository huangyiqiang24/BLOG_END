package huayq.cn.blog.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:22 2022/12/22
 */
@Setter
@Getter
@ToString
public class BaseBO {
    /**
     * 数据库主键
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
     * 最后更新人
     */
    private String updatedBy;

    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 每页显示条数
     */
    private int pageSize;


}
