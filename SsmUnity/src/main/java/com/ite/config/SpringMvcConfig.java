package com.ite.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 23187
 * @date 2022/7/4 10:18
 * @description
 */
@Configuration
@ComponentScan({"com.ite.controller","com.ite.config"})
@EnableWebMvc
public class SpringMvcConfig {
}