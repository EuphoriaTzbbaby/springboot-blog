# 使用 OpenJDK 作为基础镜像
FROM openjdk:11-jre-slim

# 设置工作目录
WORKDIR /app

# 将 JAR 包复制到容器中
COPY target/my-springboot-app.jar /app/my-springboot-app.jar

# 暴露端口
EXPOSE 8080

# 启动 Spring Boot 应用
ENTRYPOINT ["java", "-jar", "my-springboot-app.jar"]
