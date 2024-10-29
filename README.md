Spring Boot Multi-Module Configuration Server Example
This is a multi-module example project that demonstrates a distributed configuration system using Spring Boot and Spring Cloud Config. The project consists of two main modules:

Config Server - A centralized server that manages and provides configuration properties for client applications.
Clients - A client application that retrieves its configuration from the Config Server.
Table of Contents
Overview
Modules
Config Server
Clients
Project Structure
Getting Started
Running the Application
Configuration
Contributing
License
Overview
This project serves as a template for creating a multi-module Spring Boot application with a central Config Server. The Config Server pulls configuration data from a Git repository, which allows the Clients module to retrieve its configuration dynamically. This setup is useful for managing environment-specific properties across different microservices in a distributed system.

Modules
Config Server
Module Name: config-server

Description: The Config Server is a Spring Boot application that acts as a centralized configuration management service. It fetches configuration properties from a specified Git repository and serves them to client applications based on their names and profiles.

Key Annotations:

@EnableConfigServer - Activates the Config Server capabilities in the Spring Boot application.
@SpringBootApplication - Marks the entry point for the Spring Boot application.
Configuration: Defined in config-server/src/main/resources/application.yml.

Clients
Module Name: clients

Description: The Clients module is a Spring Boot application that retrieves its configuration from the Config Server at runtime. It connects to the Config Server on startup and pulls configuration values based on its application name and active profile.

Key Annotations:

@SpringBootApplication - Marks the entry point for the Clients application.
Configuration: Defined in clients/src/main/resources/application.yml.

Project Structure
bash
Копировать код
multi-module-project/
├── config-server/                # Config Server module
│   ├── src/main/java/...         # Java source files for Config Server
│   └── src/main/resources/       # Resources for Config Server (application.yml)
│
├── clients/                      # Clients module
│   ├── src/main/java/...         # Java source files for Clients application
│   └── src/main/resources/       # Resources for Clients (application.yml)
│
└── pom.xml                       # Parent POM file for the multi-module project
Getting Started
Prerequisites
Java 17 or higher
Maven 3.6+
Git (for cloning repositories and pulling configuration files)
Setup
Clone the Repository:

bash
Копировать код
git clone https://github.com/username/multi-module-config-server-example.git
cd multi-module-config-server-example
Configure Git Repository Credentials: In the config-server/src/main/resources/application.yml file, update the uri, username, and password fields under spring.cloud.config.server.git with your Git repository's information.

Running the Application
Start the Config Server:

bash
Копировать код
mvn spring-boot:run -pl config-server
The Config Server will start on port 8888 by default.

Start the Clients Application: In a new terminal window, run:

bash
Копировать код
mvn spring-boot:run -pl clients
The Clients application will start on port 8081 by default and fetch its configuration from the Config Server.

Configuration
Config Server
In the config-server module's application.yml file, configure the following properties:

yaml
Копировать код
server:
port: 8888

spring:
application:
name: config-server
cloud:
config:
server:
git:
uri: https://github.com/IhorMurashko/cloud-config.git
username: <your-username>
password: <your-password>
default-label: main
search-paths: "{application}"
Clients Application
In the clients module's application.yml file, configure the following properties:

yaml
Копировать код
server:
port: 8081

spring:
application:
name: clients
config:
import: configserver:http://localhost:8888
This configuration sets up the Clients application to retrieve configuration values from the Config Server running on localhost:8888.