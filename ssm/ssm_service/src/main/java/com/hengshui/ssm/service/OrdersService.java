package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.Orders;

import java.util.List;

public interface OrdersService {

    List<Orders> findAll(Integer page,Integer size);

    Orders findById(String ordersId);
}
