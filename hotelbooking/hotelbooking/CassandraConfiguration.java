package com.aegbt.gtr.productFilterRules.cassandra;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.convert.CassandraConverter;
import org.springframework.data.cassandra.convert.MappingCassandraConverter;
import org.springframework.data.cassandra.mapping.BasicCassandraMappingContext;
import org.springframework.data.cassandra.mapping.CassandraMappingContext;

import com.datastax.driver.auth.DseAuthProvider;
import com.datastax.driver.core.AuthProvider;

/**
 * @author Pallavi Kulkarni
 *
 */
@Configuration
public abstract class CassandraConfiguration extends AbstractCassandraConfiguration {

    @Value("${cassandra.contactpoints}")
    protected String contactPoints;

    @Value("${cassandra.port}")
    protected String portNumber;

    @Value("${cassandra.user}")
    protected String userName;

    @Value("${cassandra.password}")
    protected String password;

    public CassandraCqlClusterFactoryBean cluster() {
        CassandraCqlClusterFactoryBean bean = new CassandraCqlClusterFactoryBean();
        bean.setContactPoints(contactPoints);
        bean.setPort(Integer.parseInt(portNumber));
        bean.setUsername(userName);
        bean.setPassword(password);
        bean.setAuthProvider(getAuthProvider());
        return bean;
    }

    public CassandraConverter converter() throws ClassNotFoundException {
        return new MappingCassandraConverter(cassandraMapping());
    }

    public CassandraMappingContext cassandraMapping() throws ClassNotFoundException {
        return new BasicCassandraMappingContext();
    }

    @Bean
    public AuthProvider getAuthProvider() {
        return new DseAuthProvider();
    }
}
