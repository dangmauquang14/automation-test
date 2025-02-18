package arrayandcollection;

import java.util.ArrayList;
import java.util.List;

/*
Đặc điểm: Là một tập hợp các phần tử có thứ tự, có thể chứa các phần tử trùng lặp.
Đặc tính: Các phần tử trong List có thể truy cập theo chỉ số (index) và thứ tự của các phần tử được duy trì.
Các lớp triển khai:
ArrayList: Cấu trúc dữ liệu động, dễ dàng thay đổi kích thước, truy cập nhanh, nhưng không tối ưu khi thực hiện thao tác chèn và xóa phần tử ở giữa.
LinkedList: Cung cấp khả năng thêm/xóa phần tử nhanh chóng ở cả hai đầu, nhưng truy cập phần tử không nhanh như ArrayList.
Vector: Tương tự như ArrayList, nhưng với tính năng đồng bộ hóa (thread-safe).
Stack: Một lớp con của Vector, mô phỏng hành vi ngăn xếp (LIFO - Last In, First Out).
 */
public class ListExample {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Apple"); // Cho phép phần tử trùng lặp

		// In ra các phần tử trong List
		System.out.println(fruits); // Output: [Apple, Banana, Apple]
		
		// Duyệt qua stream
		fruits.forEach(System.out::println);
	}
}
