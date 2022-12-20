package huayq.cn.blog.dal.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */

@Getter
@Setter
@ToString(callSuper = true)
@Accessors(chain = true)
public class TagDO extends BaseDO {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 2205807706705093339L;

    /**
     * 标签编号
     */
    private String tagNo;

    /**
     * 标签名
     */
    private String name;

}
