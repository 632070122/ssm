package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.Permission;
import com.hengshui.ssm.domain.Role;

import java.util.List;

public interface RoleService {

    List<Role> findAll();

    void save(Role role);

    Role findById(String roleId);

    List<Permission> findOtherPermission(String roleId);

    void addPermissionToRole(String roleId, String[] ids);
}
