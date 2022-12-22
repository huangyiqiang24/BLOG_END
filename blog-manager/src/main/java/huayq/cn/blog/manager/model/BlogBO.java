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
public class BlogBO extends BaseBO{

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
