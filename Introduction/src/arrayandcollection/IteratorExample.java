package arrayandcollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
Đặc điểm: Cung cấp cách thức để duyệt qua các phần tử của Collection mà không cần phải biết chính xác cấu trúc 
bên trong của nó.
Các phương thức của Iterator:
hasNext(): Kiểm tra có phần tử tiếp theo hay không.
next(): Trả về phần tử tiếp theo trong Collection.
remove(): Xóa phần tử hiện tại trong Collection.
 */
public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Sử dụng Iterator để duyệt qua List
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
