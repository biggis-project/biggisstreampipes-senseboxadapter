FROM anapsix/alpine-java

EXPOSE 8088
EXPOSE 61616

ADD .target/templates-source-0.41.0-SNAPSHOT.jar  /templates-sources.jar

ENTRYPOINT ["java", "-jar", "/templates-sources.jar"]
