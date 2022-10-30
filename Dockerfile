# define base docker image
FROM openjdk:17
EXPOSE 8080
ADD target/AppPortfolio-0.0.1-SNAPSHOT.jar appPortfolio.jar
ENTRYPOINT ["java", "-jar", "/appPortfolio.jar"]