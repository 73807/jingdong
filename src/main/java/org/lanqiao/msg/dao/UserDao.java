package org.lanqiao.msg.dao;


import org.lanqiao.msg.enity.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUser();
    public boolean checkUser(User user);
}
