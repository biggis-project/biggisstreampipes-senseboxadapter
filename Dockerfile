FROM anapsix/alpine-java

EXPOSE 8085

ADD .target/biggisstreampipes-senseboxadapter-0.1.jar /biggisstreampipes-senseboxadapter.jar

ENTRYPOINT ["java", "-jar", "/biggisstreampipes-senseboxadapter.jar"]
