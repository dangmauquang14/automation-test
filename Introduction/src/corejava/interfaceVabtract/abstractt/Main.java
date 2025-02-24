package corejava.interfaceVabtract.abstractt;
/*
Abstract Class:
Định nghĩa: Abstract Class là một lớp trừu tượng có thể chứa cả phương thức có phần thân (đã triển khai) và phương thức trừu tượng (chưa triển khai).
Mục đích: Sử dụng khi có nhu cầu chia sẻ một phần code chung cho nhiều lớp con nhưng vẫn muốn một số phương thức phải được triển khai riêng ở từng lớp con.
Đặc điểm:
Không thể tạo instance trực tiếp từ Abstract Class.
Có thể có cả phương thức trừu tượng (abstract) và phương thức thông thường.
Lớp con phải kế thừa (extend) Abstract Class và triển khai tất cả phương thức trừu tượng.
Một lớp chỉ có thể kế thừa từ một Abstract Class (hạn chế đa kế thừa).
 */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.move();  // Output: Car is moving
        car.fuel();  // Output: Refueling....classpath;.settings;

    }
}
