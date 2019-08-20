package org.lanqiao.msg.service;

import org.lanqiao.msg.enity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUser();
    public boolean checkUser(User user);
}
