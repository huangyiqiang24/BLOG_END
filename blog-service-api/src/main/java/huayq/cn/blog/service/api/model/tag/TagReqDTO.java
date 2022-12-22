package huayq.cn.blog.service.api.model.tag;

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
public class TagReqDTO implements Serializable {

    /**
     * 序列化ID
     */
    private static final long serialVersionUID = 7311535155783609516L;

    /**
     * 标签编号
     */
    private String tagNo;

    /**
     * 标签名
     */
    private String name;

    /**
     * 操作人
     */
    private String operator;

}
