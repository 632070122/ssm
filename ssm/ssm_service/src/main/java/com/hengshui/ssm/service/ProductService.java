package com.hengshui.ssm.service;

import com.hengshui.ssm.domain.Product;

import java.util.List;

public interface ProductService {

    /**
     * 查询所有的商品信息,产品
     * @return
     */
    List<Product> findAll();


    /**
     * 保存产品
     * @param product
     */
    void save(Product product);
}
