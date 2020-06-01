package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Permission;

import java.util.List;

public interface PermissionDao {

    List<Permission> findByRoleId(String roleId);

    List<Permission> findAll();

    void save(Permission permission);
}
