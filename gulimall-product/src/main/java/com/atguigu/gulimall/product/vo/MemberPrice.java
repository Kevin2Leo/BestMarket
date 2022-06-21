package com.atguigu.gulimall.product.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description:
 * @Date Created in 17:27 2022/6/5
 * @Author: Chen_zhuo
 * @Modified By
 */
@Data
public class MemberPrice {

    private Long id;
    private String name;
    private BigDecimal price;

}

