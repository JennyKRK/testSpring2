package myexample.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="myexample.demo")
public class AppConfig {

    @Bean
    public YourFriend YourFriend() {
        return new YourFriend("MaryJo", 5);
    }

}
