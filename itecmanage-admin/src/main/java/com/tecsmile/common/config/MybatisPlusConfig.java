
package com.tecsmile.common.config;


import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description : mybatis-plus配置器
 * @author: tecsmile
 */
@Configuration
@MapperScan(basePackages = "com.tecsmile.modules.*.dal", sqlSessionFactoryRef = "sqlSessionFactory", sqlSessionTemplateRef = "sqlSessionTemplate")
public class MybatisPlusConfig {

	/**
	 * 配置mybatis-plus的分页插件pageHelper
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		PaginationInterceptor page = new PaginationInterceptor();
		page.setDialectType("mysql");
		return page;
	}
}
