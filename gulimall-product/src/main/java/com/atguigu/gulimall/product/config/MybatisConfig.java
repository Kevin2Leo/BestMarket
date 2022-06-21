package com.atguigu.gulimall.product.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Description:
 * @Date Created in 18:14 2022/6/4
 * @Author: Chen_zhuo
 * @Modified By
 */

@Configuration //标明为配置类
@EnableTransactionManagement //开启事务
@MapperScan("com.atguigu.gulimall.product.dao")
public class MybatisConfig {

    //引人分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页面大于最大页后操作，true调回首页，false继续请求 默认为false
        paginationInterceptor.setOverflow(true);
        //设置单页最大限制数量，默认500条， -1表示不受限制
        paginationInterceptor.setLimit(1000);
        return paginationInterceptor;
    }

}
