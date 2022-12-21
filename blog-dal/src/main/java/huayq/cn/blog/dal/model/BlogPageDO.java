package huayq.cn.blog.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 博客表
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */

@Getter
@Setter
@ToString(callSuper = true)
@Accessors(chain = true)
public class BlogPageDO extends PageDO{

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3176027538748974891L;

    /**
     * 博客编号
     */
    private String blogNo;

    /**
     * 标题
     */
    private String title;

    /**
     * 正文
     */
    private String content;

    /**
     * 简述
     */
    private String description;

    /**
     * 浏览量
     */
    private Integer views;

    /**
     * 标签
     */
    private String tag;

}
