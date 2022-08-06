package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
