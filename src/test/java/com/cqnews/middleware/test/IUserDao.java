package com.cqnews.middleware.test;

import com.cqnews.middleware.db.router.annotation.DBRouter;



public interface IUserDao {

    @DBRouter(key = "userId")
    void insertUser(String req);

}
