package com.springtester.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the Orders Application.
 * <p>
 * This application acts as a client in a distributed system setup and is configured
 * to connect to a central configuration server for its configuration properties.
 * </p>
 *
 * <p>
 * Annotations used:
 * </p>
 * <ul>
 *     <li>{@link SpringBootApplication} - Marks this class as the main entry point of the Spring Boot application.</li>
 * </ul>
 *
 * <p>
 * This application communicates with the configuration server specified in the
 * application's configuration file to fetch its settings dynamically.
 * </p>
 *
 * @see org.springframework.boot.autoconfigure.SpringBootApplication
 */
@SpringBootApplication
public class OrdersApplication {

    /**
     * The main entry point for the Spring Boot application.
     * <p>
     * This method runs the OrdersApplication, initializing Spring Boot and
     * setting up client communication with the Config Server.
     * </p>
     *
     * @param args command-line arguments passed to the application
     */
    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }

}
