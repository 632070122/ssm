package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Role;
import com.hengshui.ssm.domain.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    UserInfo findByUserName(String username);

    List<UserInfo> findAll();

    void save(UserInfo userInfo);

    UserInfo findById(String userId);

    List<Role> findOtherRoles(String id);

    void addRoleToUser(@Param("userId")String userId, @Param("roleId")String roleId);
}
