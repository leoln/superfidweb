package br.com.bhl.superfid.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration("dataSourceConfig")
public class DataSourceConfig {
	@Value("${spring.datasource.driver-class-name}")
	private String dataSourceDriver;

	@Value("${spring.datasource.url}")
	private String dataSourceUrl;

	@Value("${spring.datasource.username}")
	private String dataSourceUser;

	@Value("${spring.datasource.password}")
	private String dataSourcePassword;

	@Bean(name = "dataSource")
	public javax.sql.DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();

		dataSource.setDriverClassName(dataSourceDriver);
		dataSource.setUrl(dataSourceUrl);
		dataSource.setUsername(dataSourceUser);
		dataSource.setPassword(dataSourcePassword);

		return dataSource;
	}
}