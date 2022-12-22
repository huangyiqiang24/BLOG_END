package huayq.cn.blog.service.api.model.result;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 11:02 2022/12/22
 */
@Setter
@Getter
public class PageResDTO<T extends Serializable> implements Serializable {


    private static final long serialVersionUID = -8857624383062989451L;

    /**
     * 分页结果集
     */
    private List<T> results;

    public PageResDTO(List<T> results) {
        this.results = results;
    }
}
