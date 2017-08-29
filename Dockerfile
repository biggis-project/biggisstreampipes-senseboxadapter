FROM anapsix/alpine-java

ENV SENSEBOXADAPTER_VERSION=0.1
ENV CONSUL_LOCATION=consul

ADD target/biggisstreampipes-senseboxadapter-${SENSEBOXADAPTER_VERSION}.jar biggisstreampipes-senseboxadapter.jar

ENTRYPOINT ["java", "-jar", "/biggisstreampipes-senseboxadapter.jar"]
