### Spring Boot Multi-Module Configuration Server Example
This is a multi-module example project that demonstrates a distributed configuration system using Spring Boot and Spring Cloud Config. The project consists of two main modules:
<hr>

Config Server - A centralized server that manages and provides configuration properties for client applications.
Clients,Orders - Are clients application that retrieves its configuration from the Config Server.

This project serves as a template for creating a multi-module Spring Boot application with a central Config Server. The Config Server pulls configuration data from a Git repository, which allows the Clients module to retrieve its configuration dynamically. This setup is useful for managing environment-specific properties across different microservices in a distributed system.
<hr>

Modules
Config Server
Module Name: config-server

Description: The Config Server is a Spring Boot application that acts as a centralized configuration management service. It fetches configuration properties from a specified Git repository and serves them to client applications based on their names and profiles.
<hr>

Key Annotations:

**@EnableConfigServer** - Activates the Config Server capabilities in the Spring Boot application. 

**@SpringBootApplication** - Marks the entry point for the Spring Boot application.

Configuration: Defined in config-server/src/main/resources/application.yml.
<hr>

Clients
Module Name: clients

Description: The Clients module is a Spring Boot application that retrieves its configuration from the Config Server at runtime. It connects to the Config Server on startup and pulls configuration values based on its application name and active profile.

Key Annotations:

**@SpringBootApplication** - Marks the entry point for the Clients application.

Configuration: Defined in clients/src/main/resources/application.yml.

### Project Structure

multi-module-project/

├── config-server/                # Config Server module  
│   ├── src/main/java/...         # Java source files for Config Server  
│   └── src/main/resources/       # Resources for Config Server (application.yml)    
│  
├── clients/                      # Clients module    
│   ├── src/main/java/...         # Java source files for Clients application  
│   └── src/main/resources/       # Resources for Clients (application.yml)  
├── orders/                       # orders module    
│   ├── src/main/java/...         # Java source files for Clients application  
│   └── src/main/resources/       # Resources for Orders (application.yml)  
│
└── pom.xml                       # Parent POM file for the multi-module project
