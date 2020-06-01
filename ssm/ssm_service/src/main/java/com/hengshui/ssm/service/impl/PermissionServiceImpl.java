package com.hengshui.ssm.service.impl;

import com.hengshui.ssm.dao.PermissionDao;
import com.hengshui.ssm.domain.Permission;
import com.hengshui.ssm.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionDao permissionDao;

    @Override
    public List<Permission> findAll() {
        return permissionDao.findAll();
    }

    @Override
    public void save(Permission permission) {
        permissionDao.save(permission);
    }
}
