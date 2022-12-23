package huayq.cn.blog.service.api.model.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Service;

import javax.xml.ws.WebServiceRef;
import java.io.Serializable;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 10:43 2022/12/22
 */
@Setter
@Getter
@ToString
public class Result<T> implements Serializable {

    private static final long serialVersionUID = -2491645240607198823L;

    private boolean success;

    private T result;

    private String errorCode;

    private String errorMsg;

    public Result() {
    }

    public Result(T result) {
        this.success = true;
        this.result = result;
    }

    public Result(String errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
