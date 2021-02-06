package cn.amos.boot.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * DESCRIPTION: 数据库相关配置
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/6
 */
@Configuration
@MapperScan("cn.amos.boot.dao.mappers")
@EntityScan(basePackages = "cn.amos.boot.dao.entity")
@EnableJpaRepositories("cn.amos.boot.dao.repository")
public class DaoConfig {
}
