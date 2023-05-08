FROM maven:3.6.3-jdk-11 AS builder
COPY . /app
WORKDIR /app
RUN mvn package

FROM openjdk:11-jre-slim

# Copie o arquivo WAR para a pasta do aplicativo
COPY --from=builder /app/target/hotel-lucena.war /app/hotel-lucena.war

# Configure o diretório de trabalho
WORKDIR /app

# Defina a porta em que o aplicativo será executado
EXPOSE 8080

# Inicie o aplicativo ao iniciar o contêiner
CMD ["java", "-jar", "hotel-lucena.war"]