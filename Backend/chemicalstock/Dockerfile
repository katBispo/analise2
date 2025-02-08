# Usa a imagem do OpenJDK 21 como base
FROM openjdk:21-jdk-slim

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo JAR do seu projeto para o container
COPY target/*.jar app.jar

# Expõe a porta do backend (8080)
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]

