package huayq.cn.blog.service.api.model.blog;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:32 2022/12/22
 */
@Setter
@Getter
@ToString
public class BlogReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 6387009939217792860L;


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

    /**
     * 操作人
     */
    private String operator;

}
