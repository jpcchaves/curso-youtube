﻿# Curso TODO List

 ## Configuração base do projeto

### application.yml
```
spring:
  profiles:
    active: dev
```

### application-dev.yml
spring:
  config:
    import: optional:file:.env[.properties]
  datasource:
    username: ${DB_DEV_USERNAME}
    password: ${DV_DEV_PASSWORD}
    url: ${DB_DEV_URL}
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        show_sql: true
        format_sql: true

### application-prod.yml
spring:
  datasource:
    url:
    username:
    password:
    driver-class-name: org.postgresql.Driver
  jpa:
    hibernate:
      ddl-auto: update
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        show_sql: true
        format_sql: true
