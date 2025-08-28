# Sử dụng Tomcat 9 với JDK 21 làm base image
FROM tomcat:9-jdk21

# Xóa các ứng dụng mặc định trong Tomcat
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy toàn bộ webapp đã build vào thư mục ROOT
COPY build/web/ /usr/local/tomcat/webapps/ROOT/

# Mở cổng 8080
EXPOSE 8080

# Khởi động Tomcat khi container chạy
CMD ["catalina.sh", "run"]