package org.springcamp.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 11.
 * Time: 오후 7:10
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@EnableAutoConfiguration
public class Application {
    @Value("${tomcatport:8080}")
    private int port;

    @Bean
    public EmbeddedServletContainerFactory servletContainer() {
        return new TomcatEmbeddedServletContainerFactory(this.port);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
