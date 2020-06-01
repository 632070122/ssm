package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.Permission;

import java.util.List;

public interface PermissionService {

    List<Permission> findAll();

    void save(Permission permission);
}
