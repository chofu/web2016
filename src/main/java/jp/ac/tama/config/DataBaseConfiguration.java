package jp.ac.tama.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * Created by owner on 2016/08/03.
 */
@Configuration
@EnableTransactionManagement
public class DataBaseConfiguration {
    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private DataSource dataSource;
    /**
     * Bean: トランザクションマネージャー
     *
     * @return PlatformTransactionManager オブジェクト
     */
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager() {return new DataSourceTransactionManager(dataSource);}

}