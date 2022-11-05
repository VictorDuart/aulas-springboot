package io.github.VictorDuart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class AppConfiguration {

    @Bean(name = "applicationName")
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("Rodando config dev");
        };
    }
}
