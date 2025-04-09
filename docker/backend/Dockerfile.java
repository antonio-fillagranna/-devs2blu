# Etapa 1: Build com Maven
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /app

# Copia o projeto e faz o build do jar
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Etapa 2: Imagem final mais leve com OpenJDK apenas
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copia o jar gerado da etapa de build
COPY --from=build /app/target/*.jar app.jar

# Porta exposta (ajuste conforme sua app)
EXPOSE 8080

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "app.jar"]