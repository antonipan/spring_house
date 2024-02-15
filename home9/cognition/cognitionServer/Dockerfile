FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR ./cognition
COPY ./target/cognitionServer.jar ./cognition/cognitionServer.jar
EXPOSE 7070/tcp

CMD ["java", "-jar", "cognitionServer.jar"]