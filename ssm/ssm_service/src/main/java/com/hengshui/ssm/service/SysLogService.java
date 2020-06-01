package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.SysLog;

import java.util.List;

public interface SysLogService {

    void save(SysLog sysLog);

    List<SysLog> findAll();
}
