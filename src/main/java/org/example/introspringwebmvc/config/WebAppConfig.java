package org.example.introspringwebmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "org.example.introspringwebmvc")
@EnableWebMvc
public class WebAppConfig {
}
