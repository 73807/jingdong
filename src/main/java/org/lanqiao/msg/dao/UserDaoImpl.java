package org.lanqiao.msg.dao;

import org.lanqiao.msg.enity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl extends BaseDao<User> implements UserDao{

    @Override
    public List<User> getAllUser(){
        return executeQuery("select id,username,password from users");
    }

    @Override
    public boolean checkUser(User user) {
        List<User> list=executeQuery("select * from users where username =? and pass =? ",new Object[] {user.getUsername(),user.getPassword()});
        return list.size()>=1? true:false;
    }
}
