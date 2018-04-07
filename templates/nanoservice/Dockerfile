FROM openjdk:8

VOLUME /tmp
ADD config config
ADD ${appName}.jar ${appName}.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/${appName}.jar"]
