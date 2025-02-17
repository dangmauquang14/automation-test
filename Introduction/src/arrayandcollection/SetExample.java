package arrayandcollection;

import java.util.HashSet;
import java.util.Set;
/*
Đặc điểm: Là một tập hợp các phần tử không có thứ tự và không chứa phần tử trùng lặp.
Đặc tính: Các phần tử trong Set không có thứ tự và bạn không thể truy cập chúng theo chỉ số.
Các lớp triển khai:
HashSet: Không đảm bảo thứ tự các phần tử, và phần tử trong HashSet là duy nhất. Tối ưu cho việc tìm kiếm nhanh.
LinkedHashSet: Giữ nguyên thứ tự phần tử được thêm vào (thứ tự thêm vào).
TreeSet: Sắp xếp các phần tử theo một thứ tự tự nhiên hoặc theo một Comparator, phần tử là duy nhất.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");  // Không cho phép phần tử trùng lặp
        
        // In ra các phần tử trong Set
        System.out.println(fruits);  // Output: [Apple, Banana] (không có phần tử trùng lặp)
    }
}
