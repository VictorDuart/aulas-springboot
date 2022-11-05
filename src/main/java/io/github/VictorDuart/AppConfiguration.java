package io.github.VictorDuart;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sales App";
    }
}
