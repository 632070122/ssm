package com.hengshui.ssm.dao;

import com.hengshui.ssm.domain.Traveller;

import java.util.List;

public interface TravellerDao {

    List<Traveller> findByOrdersId(String ordersId);
}
