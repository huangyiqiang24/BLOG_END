package huayq.cn.blog.service.api.model.comment.user;

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
public class UserReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 6253586975112446679L;

    /**
     * 用户编号
     */
    private String userNo;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 状态
     */
    private String status;

    /**
     * 操作人
     */
    private String operator;

}
