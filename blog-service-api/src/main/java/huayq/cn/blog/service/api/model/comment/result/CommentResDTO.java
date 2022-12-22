package huayq.cn.blog.service.api.model.comment.result;

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
@ToString
@Accessors(chain = true)
public class CommentResDTO extends BaseResDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -2890781603270717547L;

    /**
     * 评论编号
     */
    private String commentNo;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 评论内容
     */
    private String content;

    /**
     * 上级评论
     */
    private String parentComment;
}
