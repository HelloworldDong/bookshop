package com.bookshop.service;

import java.util.List;
import java.util.Set;

import com.bookshop.entity.User;
/**
 * Created by dl on 2017/3/15.
 */
public interface UserService {
    public  User findByName(String userName);
    public Set<String> getRoles(String userName);
    public  Set<String> getPermissions(String userName);
}
