package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.dto.ProductRequest;
import com.minhao.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
