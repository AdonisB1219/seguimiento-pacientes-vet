FROM azul/zulu-openjdk:17-latest
WORKDIR /app
VOLUME /tmp
COPY target/*.jar ./app/app.jar
ENTRYPOINT ["java","-jar","./app/app.jar"]
EXPOSE 8081
