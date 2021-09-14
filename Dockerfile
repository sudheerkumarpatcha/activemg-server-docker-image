FROM openjdk:15.0-jdk
COPY image-content/apache-activemq-5.15.6-bin.tar.gz /tmp/
WORKDIR /tmp/
RUN tar -xzf apache-activemq-5.15.6-bin.tar.gz 
CMD ["apache-activemq-5.15.6/bin/activemq", "console"]
EXPOSE 8161 61616