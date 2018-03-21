FROM openjdk:8

VOLUME /tmp
ADD ${appName}.jar ${appName}.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/${appName}.jar"]
