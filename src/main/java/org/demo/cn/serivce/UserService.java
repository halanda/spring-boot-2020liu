package org.demo.cn.serivce;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.demo.cn.model.User;

public interface UserService {


    public Integer insert(User user);
    public User get(String uname);
    String login(String user, String password, HttpServletRequest request, HttpServletResponse response);
    boolean isLogin(String token);
}
