package com.hengshui.ssm.service.impl;
import com.github.pagehelper.PageHelper;
import com.hengshui.ssm.dao.OrdersDao;
import com.hengshui.ssm.domain.Orders;
import com.hengshui.ssm.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("orders")
@Transactional
public class OrdersServiceImpl implements OrdersService {

    @Autowired
    private OrdersDao ordersDao;

    @Override
    public List<Orders> findAll(Integer page,Integer size) {
        PageHelper.startPage(page,size); //分页~从哪页开始,每页显示多少条
        return ordersDao.findAll();
    }

    @Override
    public Orders findById(String ordersId) {
        return ordersDao.findById(ordersId);
    }
}
