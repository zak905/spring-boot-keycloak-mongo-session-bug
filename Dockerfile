FROM java:8-jre-alpine


COPY target/keycloak-spring-boot-demo-0.1.jar app.jar

EXPOSE 8180


CMD ["java", "-jar", "app.jar"]