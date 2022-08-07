package com.minhao.springbootmall.dao;

import com.minhao.springbootmall.dto.ProductQueryParams;
import com.minhao.springbootmall.dto.ProductRequest;
import com.minhao.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
