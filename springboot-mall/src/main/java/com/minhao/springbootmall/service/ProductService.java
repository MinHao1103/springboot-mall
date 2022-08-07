package com.minhao.springbootmall.service;

import com.minhao.springbootmall.dto.ProductRequest;
import com.minhao.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
