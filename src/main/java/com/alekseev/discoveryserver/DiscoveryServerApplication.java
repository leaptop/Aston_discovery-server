package com.alekseev.discoveryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Главный класс сервера обнаружения (Eureka).
 *
 * @EnableEurekaServer включает функциональность реестра сервисов.
 * Другие микросервисы будут регистрироваться здесь, указывая своё имя и адрес.
 * Eureka также предоставляет веб-интерфейс на порту 8761 для мониторинга.
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryServerApplication.class, args);
    }
}