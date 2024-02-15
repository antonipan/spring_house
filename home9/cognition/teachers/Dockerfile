
FROM bellsoft/liberica-openjdk-alpine:17

WORKDIR ./cognition
COPY target/teachers.jar ./cognition/teachers.jar
EXPOSE 7071/tcp

CMD ["java", "-jar", "teachers.jar"]