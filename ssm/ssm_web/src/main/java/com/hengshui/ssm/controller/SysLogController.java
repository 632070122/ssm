package com.hengshui.ssm.controller;

import com.hengshui.ssm.domain.SysLog;
import com.hengshui.ssm.service.SysLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/sysLog")
public class SysLogController {

    @Autowired
    private SysLogService sysLogService;

    @RequestMapping("/findAll.do")
    public ModelAndView findAll(){
        List<SysLog> findAll = sysLogService.findAll();
        ModelAndView mv = new ModelAndView();
        mv.addObject("sysLogs",findAll);
        mv.setViewName("syslog-list");
        return mv;
    }
}
