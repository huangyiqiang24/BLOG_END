package huayq.cn.blog.manager.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 14:22 2022/12/22
 */
@Setter
@Getter
@ToString(callSuper = true)
@Accessors(chain = true)
public class TagBO extends BaseBO{

    /**
     * 标签编号
     */
    private String tagNo;

    /**
     * 标签名
     */
    private String name;

}
