package com.sefadalgic.fooddelivery.app.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.web.SecurityFilterChain


@Configuration
@EnableWebSecurity
class SecurityConfig {

    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .csrf { it.disable() }
            .authorizeHttpRequests {
                it.requestMatchers("/auth/**").permitAll()  // login, register açık
                it.anyRequest().permitAll() // Geliştirme aşamasında tüm endpoint'leri açık bırak
                // it.anyRequest().authenticated() // Prod'da bu şekilde koruma altına alabilirsin
            }
            .formLogin { it.disable() } // Spring’in default login formunu kapat
            .httpBasic { it.disable() } // Basic auth’u da kapat
        return http.build()
    }


    @Bean
    fun passwordEncodor(): PasswordEncoder = BCryptPasswordEncoder();
}