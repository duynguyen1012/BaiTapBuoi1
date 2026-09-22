# Bài tập buổi 1 - Lập trình giao diện Android
 Nguyễn Đức Duy - BIT240080

## 1. Giới thiệu chung
Đây là mã nguồn bài tập thực hành buổi 1. Ứng dụng được phát triển nhằm mục đích mô phỏng lại giao diện UI chia theo tỷ lệ các khối màu chính xác như yêu cầu của đề bài.

## 2. Công cụ và Công nghệ sử dụng
- **Môi trường phát triển (IDE):** Android Studio
- **Ngôn ngữ lập trình:** Kotlin
- **Bộ công cụ UI:** Jetpack Compose
- **Quản lý phiên bản:** Git & GitHub
- **Máy ảo kiểm thử (AVD):** Pixel 10 Pro (API 37)

## 3. Quá trình thực hiện
- **Xây dựng bố cục (Layout):** Sử dụng hàm `AssignmentLayout()` với các thành phần cốt lõi của Jetpack Compose bao gồm `Column`, `Row` và thuộc tính `Modifier.weight` để tự động chia tỷ lệ các khối màu từ 1 đến 6 sao cho hiển thị tương thích trên màn hình.
- **Tối ưu hóa môi trường:** Thiết lập biến môi trường `ANDROID_AVD_HOME` để chuyển hướng lưu trữ máy ảo (Virtual Device) sang ổ D, giải quyết triệt để vấn đề tràn bộ nhớ ổ C cục bộ.
- **Kiểm thử và Triển khai:** Build và chạy thành công ứng dụng trên giả lập Pixel 10 Pro. Đóng gói mã nguồn đẩy lên public repository trên GitHub.

## 4. Demo Giao diện & video:






giao diện sau khi chạy xong         <img width="959" height="539" alt="image" src="https://github.com/user-attachments/assets/17b83342-4805-48f6-ae0f-30206843399a" />      

link video: 

cắt một nửa giao diện số 5 mà thầy yêu cầu ở trên lớp:          <img width="959" height="509" alt="image" src="https://github.com/user-attachments/assets/b87f5b6c-74f5-4b09-a0ed-68a6430ba610" />     
