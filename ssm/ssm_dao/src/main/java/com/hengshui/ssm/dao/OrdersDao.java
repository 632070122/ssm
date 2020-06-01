package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Orders;

import java.util.List;

public interface OrdersDao {

    /**
     * 所有订单
     * @return
     */
    List<Orders> findAll();

    /**
     * 根据ordersId查询详细信息
     * @param ordersId
     * @return
     */
    Orders findById(String ordersId);
}
