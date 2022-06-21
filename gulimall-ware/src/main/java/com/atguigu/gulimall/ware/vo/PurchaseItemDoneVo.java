package com.atguigu.gulimall.ware.vo;

import lombok.Data;

/**
 * @Description:
 * @Date Created in 18:09 2022/6/11
 * @Author: Chen_zhuo
 * @Modified By
 */
@Data
public class PurchaseItemDoneVo {

    private Long itemId;

    private Integer status;

    private String reason;

}
