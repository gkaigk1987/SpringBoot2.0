package com.gk.database;

import java.sql.SQLException;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;

@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = {"com.gk.mapper"})
public class MyBatisConfiguration {
	
	private static Logger logger = LoggerFactory.getLogger(MyBatisConfiguration.class);
	
	@Value("${spring.datasource.url}")
	private String databaseUrl;
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;
	
	@Value("${spring.datasource.username}")
	private String userName;
	
	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.filters}")
	private String filters;
	
	@Value("${spring.datasource.maxActive}")
	private Integer maxActive;
	
	@Value("${spring.datasource.initialSize}")
	private Integer initialSize;
	
	@Value("${spring.datasource.minIdle}")
	private Integer minIdle;
	
	@Value("${spring.datasource.maxWait}")
	private Long maxWait;
	
	//无需配置mybatis，mybatis-spring-boot-starter自读读取yml文件进行配置
//	@Value("${mybatis.mapper-locations}")
//	private String mapperLocations;
	
//	@Value("${mybatis.type-aliases-package}")
//	private String typeAliasesPackage;
	
	@Bean(name = "dataSource")
	public DruidDataSource dataSource() throws SQLException {
		DruidDataSource dataSource = new DruidDataSource();
		logger.info("Init Druid datasource start ......");
		dataSource.setUrl(databaseUrl);
		dataSource.setDriverClassName(driverClassName);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setFilters(filters);
		dataSource.setMaxActive(maxActive);
		dataSource.setInitialSize(initialSize);
		dataSource.setMinIdle(minIdle);
		dataSource.setMaxWait(maxWait);
		logger.info("Init Druid datasource end ......");
		return dataSource;
	}
	
	/**
	 * 配置druid监控
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean druidServlet() {
		ServletRegistrationBean reg = new ServletRegistrationBean();
		reg.setServlet(new StatViewServlet());
		reg.addUrlMappings("/monitor/druid/*");
		// 白名单
		reg.addInitParameter("allow", "127.0.0.1");
		// IP黑名单(共同存在时，deny优先于allow)
//		reg.addInitParameter("deny", "192.168.2.105");        
		// /druid/login.html登录时账号密码
		reg.addInitParameter("loginUsername", "root");
		reg.addInitParameter("loginPassword", "admin");
		//是否能够重置数据 禁用HTML页面上的“Reset All”功能
		reg.addInitParameter("resetEnable", "false");
		return reg;
	}
	
	
}
