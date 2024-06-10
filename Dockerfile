FROM ubuntu:18.04

RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    apt-get clean;

WORKDIR /app

# JAR 파일 메인 디렉토리에 복사
COPY build/libs/MemberService.jar /app/app.jar

#시스템 진입점 정의
CMD ["java","-jar","app.jar"]