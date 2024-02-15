FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR ./cognition
COPY target/questionnaires.jar ./cognition/questionnaires.jar
EXPOSE 7071/tcp

CMD ["java", "-jar", "questionnaires.jar"]