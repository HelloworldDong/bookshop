package com.bookshop.realm;

import java.util.HashSet;
import java.util.Set;

import com.bookshop.entity.User;
import com.bookshop.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.subject.PrincipalCollection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dl on 2017/3/18.
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private UserService userService;

    //为当前登录成功的用户授予权限和角色，已经登录成功了。
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username=(String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo  authorizationInfo=new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.getRoles(username));
        authorizationInfo.setStringPermissions(userService.getPermissions(username));
        return authorizationInfo;
    }
    //验证当前登录的用户，获取认证信息。
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username=(String) token.getPrincipal();//获取用户名
        User user=userService.findByName(username);

        if(user!=null){
            AuthenticationInfo authcInfo =new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"myRealm");
            return authcInfo;
        }else{
            return null;
        }
    }
}
