package me.kz

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
open class AppConfig {
    @Bean
    open fun myService(): Service = ServiceImp()
}
