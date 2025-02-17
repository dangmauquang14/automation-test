package file.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/* 
 	Đọc toàn bộ nội dung file vào List<String>.
	Ưu điểm: Ngắn gọn, dễ sử dụng.
	Nhược điểm: Không phù hợp với file quá lớn (vì đọc toàn bộ vào bộ nhớ)
	Giải thích:
	Paths.get("example.txt"): Xác định đường dẫn tới file.
	Files.readAllLines(): Đọc toàn bộ nội dung file thành List<String>.
	.forEach(System.out::println): In từng dòng trong List.
 */
public class ReadTextFileNIO {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/file/example.txt"));
            lines.forEach(System.out::println);  // In từng dòng ra màn hình
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}