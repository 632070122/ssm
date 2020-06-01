package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.SysLog;

import java.util.List;

public interface SysLogDao {

    void save(SysLog sysLog);

    List<SysLog> findAll();
}
