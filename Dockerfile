FROM openjdk:8-jdk-alpine
COPY "./target/atm-deposit-0.0.1-SNAPSHOT.jar" "app.jar"
EXPOSE 8000
ENTRYPOINT [ "java","-jar","app.jar" ]