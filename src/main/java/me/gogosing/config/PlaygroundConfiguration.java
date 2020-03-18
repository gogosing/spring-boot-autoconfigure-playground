package me.gogosing.config;

import me.gogosing.autoconfigure.Playground;
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

    /**
     * @ConditionalOnMissingBean annotation을 선언하면, 사전에 해당 타입의 Bean이 Ioc 컨테이너에 없을 때에만 Bean으로 등록한다.
     * @SpringBootApplication annotation을 사용하였을 시, 아래의 순서로 Bean 을 등록한다.
     * 1. @ComponentScan : component-scanning을 통하여 base-package 이하 bean 들을 등록한 뒤,
     * 2. @EnableAutoConfiguration : Spring Boot 에 사전 정의된 설정들을 로드하여 bean 들을 등록.
     * 즉,
     * @ComponentScan 에서 사전에 해당 타입의 Bean이 등록되었으나,
     * @EnableAutoConfiguration 에 의하여 또 다시 같은 타입의 Bean이 등록 될 경우,
     * @ComponentScan 에서 등록한 Bean은 무시될 수 있다.
     * 이를 피하기 위하여, @ConditionalOnMissingBean 를 사용.
     */
    @Bean
    @ConditionalOnMissingBean
    public Playground playground(PlaygroundProperties properties) {
        Playground playground = new Playground();
        playground.setName(properties.getName());
        playground.setAge(properties.getAge());
        return playground;
    }
}
