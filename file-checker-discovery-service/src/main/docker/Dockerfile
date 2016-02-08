FROM java:8
VOLUME /tmp
ADD file-checker-discovery-service*.jar app.jar
EXPOSE 8761
RUN bash -c 'touch app.jar' && bash -c 'chown nobody /tmp' && bash -c 'chmod 775 /tmp'
USER nobody 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]