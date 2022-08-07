package com.minhao.springbootmall.dto;

import com.minhao.springbootmall.constant.ProductCategory;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class ProductRequest {

    @NotNull
    @Column(name = "product_name")
    private String productName;

    @NotNull
    @Column(name = "category")
    private ProductCategory category;

    @NotNull
    @Column(name = "image_url")
    private String imageUrl;

    @NotNull
    @Column(name = "price")
    private Integer price;

    @NotNull
    @Column(name = "stock")
    private Integer stock;

    @Column(name = "description")
    private String description;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
