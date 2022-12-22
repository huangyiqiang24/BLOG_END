package huayq.cn.blog.manager.convert;

import huayq.cn.blog.dal.model.PageDO;
import huayq.cn.blog.manager.model.PageBO;

/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 19:53 2022/12/22
 */
public class PageConvert {

    public static PageDO getPageDO(PageBO pageBO){
        PageDO pageDO = new PageDO();
        pageDO.setCurrentPage(pageBO.getCurrentPage());
        pageDO.setPageSize(pageBO.getPageSize());
        return pageDO;
    }
}
