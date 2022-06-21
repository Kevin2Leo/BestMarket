package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @Description:
 * @Date Created in 0:17 2022/6/5
 * @Author: Chen_zhuo
 * @Modified By
 */
@Data
public class AttrRespVo extends AttrVo{

    private String catelogName;

    private String groupName;

    private Long[] catelogPath;
}
