package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Permission;
import com.hengshui.ssm.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleDao {

    List<Role> findRoleByUserId(String userId);

    List<Role> findAll();

    void save(Role role);

    Role findById(String roleId);

    List<Permission> findOtherPermission(String roleId);

    void addPermissionToRole(@Param("roleId") String roleId,@Param("permissionId") String permissionId);
}
