FROM 192.168.3.88:20202/default/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/zcstest-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
