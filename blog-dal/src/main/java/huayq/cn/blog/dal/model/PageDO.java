package huayq.cn.blog.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:43 2022/12/20
 */

@Getter
@Setter
@ToString
public class PageDO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3838901181702888670L;

    /**
     * 当前页
     */
    private int currentPage ;

    /**
     * 每页显示条数
     */
    private int pageSize ;

    /**
     * 起始位置
     */
    private int startIndex;

    /**
     * 结束位置
     */
    private int endIndex;

    /**
     * 排序规则
     */
    private String sort;
}
