package com.bookshop.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bookshop.dao.UserDao;
import com.bookshop.entity.User;
import com.bookshop.service.UserService;
/**
 * Created by dl on 2017/3/15.
 */
@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public User findByName(String userName) {
        return userDao.findByName(userName);
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public Set<String> getRoles(String userName){return userDao.getRoles(userName);}


    @Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
    public  Set<String> getPermissions(String userName){return userDao.getPermissions(userName);}
}
