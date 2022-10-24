package com.minhao.springbootmall.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
* Same Origin Policy ( 同源策略 )
* 目的在於防止某個文檔或者腳本從多個不同 “origin”（源）裝載，尤其是 JavaScript。
* 相同的 Origin，也即是擁有相同的協議、主機地址以及端口，
* 如果這三項數據中有一項不同，那麼該資源就將被認爲是從不同的 Origin 得來的，進而不被允許訪問。
*
* Cross-origin resource sharing ( 跨域資源共享 )，CORS 是一個 W3C 標準，
* 是針對不同源的請求而定的規範，透過 JavaScript 存取非同源資源時，server 必須明確告知瀏覽器允許何種請求，
* 只有 server 允許的請求能夠被瀏覽器實際發送，否則會失敗，並且克服 AJAX 只能同源使用的限制。
* */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // "/**" 表示允许所有連結跨域訪問
                .allowedOrigins("http://localhost:4200") // 指定 IP 允許跨域
                .allowedMethods("GET", "POST", "DELETE", "PUT"); // 允许 http 的方法
    }
}
