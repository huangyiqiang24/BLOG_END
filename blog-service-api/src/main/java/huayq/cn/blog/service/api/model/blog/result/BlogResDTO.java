package huayq.cn.blog.service.api.model.blog.result;

import huayq.cn.blog.service.api.model.result.BaseResDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:32 2022/12/22
 */
@Setter
@Getter
@ToString(callSuper = true)
@Accessors(chain = true)
public class BlogResDTO extends BaseResDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3199750650429169778L;

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
