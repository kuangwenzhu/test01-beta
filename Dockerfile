FROM 192.168.0.249:20202/hwcse/as-docker-java:1.11.2-8

WORKDIR /home/apps/
ADD target/test27-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
