package huayq.cn.blog.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 19:47 2022/12/22
 */
@Setter
@Getter
@ToString
public class PageBO {

    /**
     * 当前页
     */
    private int currentPage;

    /**
     * 每页显示条数
     */
    private int pageSize;

}
