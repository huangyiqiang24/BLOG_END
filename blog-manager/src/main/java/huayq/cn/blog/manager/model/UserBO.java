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
public class UserBO extends BaseBO{

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

}
