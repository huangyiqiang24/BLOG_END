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
public class CommentBO extends BaseBO{

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
