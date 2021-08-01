package org.demo.cn.serivce;

import org.demo.cn.model.User;

public interface UserService {


    public Integer insert(User user);
    public User get(String uname);
}
