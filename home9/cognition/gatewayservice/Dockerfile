FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR ./cognition
COPY target/gatewayservice.jar ./cognition/gatewayservice.jar
EXPOSE 7070/tcp

CMD ["java", "-jar", "gatewayservice"]