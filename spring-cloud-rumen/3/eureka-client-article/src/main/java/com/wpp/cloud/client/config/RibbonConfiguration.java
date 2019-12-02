package com.wpp.cloud.client.config;

import com.wpp.cloud.client.rule.MyRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {
    /**
     * 配置均衡策略
     *
     * @return
     */
    @Bean
    public MyRule irule() {
        return new MyRule();
    }

}
