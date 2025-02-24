package corejava.arrayandcollection;

import java.util.LinkedList;
import java.util.Queue;
/*
Đặc điểm: Là một cấu trúc dữ liệu theo nguyên lý FIFO (First-In-First-Out), nghĩa là phần tử được thêm vào đầu tiên sẽ được lấy ra đầu tiên.
Các lớp triển khai:
LinkedList: Cũng có thể sử dụng như Queue, hỗ trợ các thao tác thêm, xóa phần tử ở đầu và cuối.
PriorityQueue: Cho phép các phần tử có ưu tiên khác nhau, các phần tử có giá trị ưu tiên cao hơn sẽ được lấy ra trước.
ArrayDeque: Là một queue (hoặc deque - double-ended queue) có thể thao tác ở cả hai đầu.
 */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Orange");
        
        // Lấy phần tử ra khỏi Queue theo FIFO
        System.out.println(queue.poll());  // Output: Apple
    }
}
