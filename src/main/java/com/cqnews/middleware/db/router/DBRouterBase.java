package com.cqnews.middleware.db.router;

/**
 * @description: 数据源基础配置
*/
public class DBRouterBase {

    private String tbIdx;

    public String getTbIdx() {
        return DBContextHolder.getTBKey();
    }

}
