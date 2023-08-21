# Utilisez une image de base avec une version appropriée de Java
FROM openjdk:11-jre-slim

# Répertoire de travail dans le conteneur
WORKDIR /app

# Exposez le port sur lequel votre application écoutera
EXPOSE 9880

# Copiez les fichiers nécessaires dans le conteneur
COPY target/quarkus-app/quarkus-run.jar /app/quarkus-run.jar

# Commande pour exécuter l'application
CMD ["java", "-jar", "quarkus-run.jar"]







