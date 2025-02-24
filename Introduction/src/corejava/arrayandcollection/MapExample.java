package corejava.arrayandcollection;

import java.util.HashMap;
import java.util.Map;
/*
Đặc điểm: Là một cấu trúc dữ liệu lưu trữ các cặp key-value, trong đó key là duy nhất và được dùng để tra cứu giá trị (value).
Các lớp triển khai:
HashMap: Cung cấp khả năng tra cứu giá trị nhanh chóng, không đảm bảo thứ tự của các phần tử.
LinkedHashMap: Duy trì thứ tự phần tử theo cách chúng được thêm vào.
TreeMap: Sắp xếp các phần tử theo thứ tự tự nhiên của key hoặc theo một Comparator.
 */

public class MapExample {
	public static void main(String[] args) {
		Map<String, String> fruitColors = new HashMap<>();
		fruitColors.put("Apple", "Red");
		fruitColors.put("Banana", "Yellow");

		// Truy cập giá trị theo key
		System.out.println(fruitColors.get("Apple")); // Output: Red

		// Duyệt và in ra các phần tử trong Map
		for (Map.Entry<String, String> entry : fruitColors.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}

		// Duyệt qua keys và lấy value bằng get()
		for (String key : fruitColors.keySet()) {
			System.out.println("Key: " + key + ", Value: " + fruitColors.get(key));
		}

		// Duyệt qua values
		for (String value : fruitColors.values()) {
			System.out.println("Value: " + value);
		}

		// Duyệt qua Stream
		fruitColors.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
	}
}
