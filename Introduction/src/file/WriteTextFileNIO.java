package file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/*
Ghi toàn bộ nội dung từ một List<String> vào file.
Ưu điểm: Ngắn gọn, dễ sử dụng.
Nhược điểm: Không linh hoạt nếu muốn ghi từng dòng một cách tùy biến.
java
Giải thích:
Arrays.asList(...): Tạo danh sách các dòng cần ghi.
Paths.get("example.txt"): Đường dẫn tới file.
Files.write(...): Ghi toàn bộ nội dung List<String> vào file.
 */
public class WriteTextFileNIO {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Hello, World!", "This is a text file.");
        try {
            Files.write(Paths.get("src/file/writetextfilenio.txt"), lines);  // Ghi toàn bộ nội dung vào file
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}