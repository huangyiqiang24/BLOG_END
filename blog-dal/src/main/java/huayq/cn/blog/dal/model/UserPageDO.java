package huayq.cn.blog.dal.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;


/**
 * <p>
 * 用户表
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */

@Getter
@Setter
@ToString(callSuper = true)
@Accessors(chain = true)
public class UserPageDO extends PageDO {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = -3536662719308473603L;

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
