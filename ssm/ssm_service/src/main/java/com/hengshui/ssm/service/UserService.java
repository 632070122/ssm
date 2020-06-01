package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.Role;
import com.hengshui.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {


    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(String id);

    List<Role> findOtherRoles(String id);

    void addRoleToUser(String userId, String[] roleIds);
}
