package corejava.interfaceVabtract.interfacee;
/*
Interface:
Định nghĩa: Interface là một tập hợp các phương thức trừu tượng (không có phần triển khai) mà các lớp có thể implement (thực thi).
Mục đích: Định nghĩa các hành vi mà nhiều lớp khác nhau có thể cùng thực hiện nhưng triển khai theo cách riêng.
Đặc điểm:
Không thể chứa phương thức có phần thân (trừ khi là phương thức mặc định - default method từ Java 8).
Các thuộc tính trong Interface đều là public static final (hằng số).
Một lớp có thể implement nhiều Interface (đa kế thừa).
 */
public class Main {
	public static void main(String[] args) {
		Animal dog = new Dog();
		dog.sound(); // Output: Dog barks
		dog.move(); // Output: Dog runs
	}
}
