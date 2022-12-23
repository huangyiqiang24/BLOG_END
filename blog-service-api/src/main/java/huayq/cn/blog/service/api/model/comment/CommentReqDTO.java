package huayq.cn.blog.service.api.model.comment;

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
public class CommentReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -8625149522925116973L;

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

    /**
     * 操作人
     */
    private String operator;

}
