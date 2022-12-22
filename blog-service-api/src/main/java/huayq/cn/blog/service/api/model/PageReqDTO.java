package huayq.cn.blog.service.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:07 2022/12/22
 */
@Setter
@Getter
@ToString
public class PageReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 8367297545040136486L;

    /**
     * 当前页
     */
    private int currentPage = 1;

    /**
     * 每页显示条数
     */
    private int pageSize = 10;
}
