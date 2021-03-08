package group_id_test;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("group_id_test")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConf {
}
