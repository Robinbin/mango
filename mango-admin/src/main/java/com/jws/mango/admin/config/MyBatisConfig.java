package com.jws.mango.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author jws
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.jws.mango.admin.mapper")
public class MyBatisConfig {

//    @Autowired
//    private DataSource dataSource;
//
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(dataSource);
//        sessionFactory.setTypeAliasesPackage("com.jws.mango.admin.model");
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//        sessionFactory.setMapperLocations(resolver.getResources("classpath:mybatis/*.xml"));
//
//        return sessionFactory.getObject();
//    }
}
