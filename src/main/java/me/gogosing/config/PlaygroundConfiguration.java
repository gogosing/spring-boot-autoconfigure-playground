package me.gogosing.config;

import me.gogosing.properties.Playground;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by JinBum Jeong on 2020/03/18.
 */
@Configuration
@EnableConfigurationProperties(PlaygroundProperties.class)
public class PlaygroundConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public Playground playground(PlaygroundProperties properties) {
        Playground playground = new Playground();
        playground.setName(properties.getName());
        playground.setAge(properties.getAge());
        return playground;
    }
}
