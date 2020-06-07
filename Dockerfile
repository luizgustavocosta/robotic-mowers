FROM openjdk:8-jre-alpine
COPY target/*jar-with-dependencies.jar /app.jar
CMD ["/usr/bin/java", "-jar", "/app.jar"]