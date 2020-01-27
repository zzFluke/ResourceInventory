[![Build](https://github.com/zzFluke/ResourceInventory/workflows/Java%20CI/badge.svg?branch=master)](https://github.com/zzFluke/ResourceInventory/actions?query=workflow%3A%22Java+CI%22+branch%3Amaster) [![Coverage Status](https://coveralls.io/repos/github/zzFluke/ResourceInventory/badge.svg?branch=master)](https://coveralls.io/github/zzFluke/ResourceInventory?branch=master)

# Demo Web Application Project for Resource Inventory

## Developed with:
Gradle, Spring Boot, Embedded Tomcat, Spring Data, Spring Data REST, JPA, Hibernate, Embedded (In-Memory) H2 Database, Apache Shiro, JOOQ, Swagger

## Features:
- Metadata Driven Resource Types and Resource Properties
- Enhanced, customizable and flexible Security Model

## Setup/Run:
- `gradlew bootRun` - starts Application Server on 8080 port and H2 Database server on 9092 TCP port with Web UI on 8082.
- `gradlew bootJar` - builds Application jar
