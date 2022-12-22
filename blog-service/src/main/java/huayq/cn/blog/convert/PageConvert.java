package huayq.cn.blog.convert;

import huayq.cn.blog.manager.model.PageBO;
import huayq.cn.blog.service.api.model.PageReqDTO;


/**
 * @Author: huangyiqiang
 * @Description:
 * @Date: Created in 19:48 2022/12/22
 */

public class PageConvert {

    public static PageBO getPageBO(PageReqDTO pageReqDTO){
        PageBO pageBO = new PageBO();
        pageBO.setCurrentPage(pageReqDTO.getCurrentPage());
        pageBO.setPageSize(pageReqDTO.getPageSize());
        return pageBO;

    }

}
