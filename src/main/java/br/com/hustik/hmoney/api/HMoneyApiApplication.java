package br.com.hustik.hmoney.api;

import br.com.hustik.hmoney.api.config.property.HMoneyApiProperty;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(HMoneyApiProperty.class)
public class HMoneyApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMoneyApiApplication.class, args);
    }

}
