# Használjuk a hivatalos openjdk képet, ami tartalmazza a JDK-t
FROM openjdk:17-jdk-slim

# A Spring Boot alkalmazás jar fájlt másoljuk a konténerbe
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Állítsuk be a parancsot, ami elindítja az alkalmazást
ENTRYPOINT ["java", "-jar", "/app.jar"]

# Az alkalmazás alapértelmezett portja (ha más portot használsz, módosítani kell)
EXPOSE 8080
