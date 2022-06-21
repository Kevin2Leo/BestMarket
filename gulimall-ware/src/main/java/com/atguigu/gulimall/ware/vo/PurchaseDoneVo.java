package com.atguigu.gulimall.ware.vo;


import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @Description:
 * @Date Created in 18:06 2022/6/11
 * @Author: Chen_zhuo
 * @Modified By
 */
@Data
public class PurchaseDoneVo {

    @NotNull(message = "id不允许为空")
    private Long id;

    private List<PurchaseItemDoneVo> items;

}
