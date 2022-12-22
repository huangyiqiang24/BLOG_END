package huayq.cn.blog.service.api.model.comment.user.result;

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
public class UserResDTO extends BaseResDTO implements Serializable {

    private static final long serialVersionUID = -2890781603270717547L;

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
