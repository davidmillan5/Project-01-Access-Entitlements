package co.fintech.entitlements.api;

import co.com.bancolombia.api.config.CorsConfig;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan(basePackages = "co.com.bancolombia.api",
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.ASSIGNABLE_TYPE,
                classes = CorsConfig.class
        ))
@Import(ApiRest.class)
public class TestConfig {
}