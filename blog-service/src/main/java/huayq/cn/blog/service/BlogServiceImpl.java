package huayq.cn.blog.service;


import huayq.cn.blog.service.api.BlogService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 博客表 服务实现类
 * </p>
 *
 * @author huangyiqiang
 * @since 2022-12-19
 */
@DubboService
@Slf4j
public class BlogServiceImpl implements BlogService {
    @Override
    public String say() {
        return "SUCCESS";
    }
}
