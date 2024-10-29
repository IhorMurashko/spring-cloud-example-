package com.springtester.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Main class for the Spring Boot Cloud Config Server.
 * <p>
 * This application serves as a configuration server, providing configuration properties
 * to client applications via a centralized configuration repository.
 * </p>
 *
 * <p>
 * This server fetches configuration files from a Git repository specified in the application
 * properties and exposes them over HTTP to client services.
 * </p>
 *
 * <p>
 * Annotations used:
 * </p>
 * <ul>
 *     <li>{@link EnableConfigServer} - Activates the Spring Cloud Config Server.</li>
 *     <li>{@link SpringBootApplication} - Marks this class as a Spring Boot application.</li>
 * </ul>
 *
 * @see org.springframework.cloud.config.server.EnableConfigServer
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    /**
     * The main entry point for the Spring Boot application.
     * <p>
     * This method runs the application as a Spring Boot service, setting up
     * the environment and launching the configuration server.
     * </p>
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        // Launches the ConfigServerApplication, initializing Spring Boot and enabling
        // Config Server functionality as per the annotations used.
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
