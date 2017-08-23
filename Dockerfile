FROM anapsix/alpine-java

EXPOSE 8085

ENV SENSEBOXADAPTER_VERSION=0.1

ADD https://github.com/biggis-project/biggisstreampipes-senseboxadapter/releases/download/v{SENSEBOXADAPTER_VERSION}/biggisstreampipes-senseboxadapter-${SENSEBOXADAPTER_VERSION}.jar /biggisstreampipes-senseboxadapter.jar

ENTRYPOINT ["java", "-jar", "/biggisstreampipes-senseboxadapter.jar"]
