# Job-Company Project

Dự án **Job-Company** là một hệ thống **microservices** cho phép quản lý **Job** (việc làm) và **Company** (công ty). Dự án sử dụng **Spring Boot**, **PostgreSQL**, **Docker**, **pgAdmin** và một số thành phần khác trong hệ sinh thái Spring. Ngoài ra, bạn có thể mở rộng để thêm các tính năng như **Review**, **Ứng tuyển**, v.v.

---

## Mục Lục

- [Giới Thiệu](#giới-thiệu)
- [Kiến Trúc](#kiến-trúc)
- [Công Nghệ Sử Dụng](#công-nghệ-sử-dụng)
- [Yêu Cầu](#yêu-cầu)
- [Cách Chạy Dự Án](#cách-chạy-dự-án)
- [Cấu Trúc Thư Mục](#cấu-trúc-thư-mục)
- [API Chính](#api-chính)
- [Đóng Góp](#đóng-góp)
- [Giấy Phép](#giấy-phép)

---

## Giới Thiệu

- **Mục tiêu**: 
  - Xây dựng hệ thống quản lý tuyển dụng (Job) và thông tin công ty (Company) dưới dạng microservices.
  - Dễ dàng mở rộng, bảo trì, và triển khai.

- **Chức năng cơ bản**:
  1. **Quản lý Job**: Tạo, xem, sửa, xóa công việc (title, description, salary range, location,...).
  2. **Quản lý Company**: Thông tin công ty, danh sách job thuộc công ty.
  3. **(Tuỳ chọn) Review**: Cho phép đánh giá công ty (rating, comment,...).

---

## Kiến Trúc

1. **Job Service**: Xử lý CRUD cho **Job**.  
2. **Company Service**: Xử lý CRUD cho **Company**, liên kết với Job.  
3. **(Tuỳ chọn) Review Service**: Xử lý review/đánh giá công ty.  
4. **PostgreSQL**: Lưu trữ dữ liệu.  
5. **pgAdmin**: Công cụ quản lý DB qua giao diện web.  
6. **Docker**: Đóng gói và triển khai microservices.  
7. **Service Registry** (nếu cần): Dùng Netflix Eureka hoặc Consul để quản lý service discovery.

---

## Công Nghệ Sử Dụng

- **Java 17+** và **Spring Boot 3+**  
- **Spring Data JPA**  
- **Spring Web** (RESTful API)  
- **PostgreSQL** (lưu dữ liệu)  
- **Docker** & **Docker Compose** (chạy container)  
- **pgAdmin** (quản trị PostgreSQL)  
- **Lombok** (tùy chọn)  
- **Maven** (quản lý dependencies)

---

## Yêu Cầu

1. **Java 17+** (hoặc cài JDK 17).  
2. **Maven 3+** (nếu không dùng Maven Wrapper).  
3. **Docker** & **Docker Compose** (nếu muốn chạy bằng container).  
4. **PostgreSQL** cài cục bộ (tuỳ chọn) hoặc chạy qua Docker.

