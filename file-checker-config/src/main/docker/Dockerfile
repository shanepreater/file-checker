FROM java:8
VOLUME /tmp
ADD file-checker-config*.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]