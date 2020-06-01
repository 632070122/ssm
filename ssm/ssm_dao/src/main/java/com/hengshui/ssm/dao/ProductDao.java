package com.hengshui.ssm.dao;
import com.hengshui.ssm.domain.Product;

import java.util.List;

public interface ProductDao {

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

    /**
     * 根据id查询产品
     */
    Product findById(String id);
}
