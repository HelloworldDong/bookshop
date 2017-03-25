package com.bookshop.dao;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Repository;
import com.bookshop.entity.User;
/**
 * Created by dl on 2017/3/15.
 */
@Repository(value="userDao")
public interface UserDao {
    public  List<User> show();
    public Set<String> getRoles(String userName);
    public  Set<String> getPermissions(String userName);
}
