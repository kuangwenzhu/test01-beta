FROM 192.168.0.249:20202/hwcse/as-java:8

WORKDIR /home/apps/
ADD target/zcstest-1.0.0.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
