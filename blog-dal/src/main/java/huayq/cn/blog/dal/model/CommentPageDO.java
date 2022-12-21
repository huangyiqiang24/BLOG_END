package huayq.cn.blog.dal.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */

@Getter
@Setter
@ToString(callSuper = true)
@Accessors(chain = true)
public class CommentPageDO extends PageDO {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -6047994345277554882L;

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
