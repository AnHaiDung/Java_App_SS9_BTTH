1. Gỡ mìn tư duy
Lựa chọn Resolver: Dùng CookieLocaleResolver.
Lý do: Session chỉ tồn tại khi trình duyệt mở. Khi khách tắt máy, Session mất. CookieLocaleResolver ghi thiết lập vào ổ cứng trình duyệt (Client), đảm bảo "nhớ" được ngôn ngữ ngay cả khi khách mở lại trang vào ngày hôm sau.
2. Lỗi Bẫy 1: Lỗi 400 xảy ra do @CookieValue mặc định yêu cầu Cookie bắt buộc phải tồn tại. Khách mới chưa có Cookie nên hệ thống ném ngoại lệ ngay lập tức.
Cách cứu: Thêm thuộc tính required = false và defaultValue = "vi" vào annotation để Spring gán giá trị mặc định thay vì báo lỗi.