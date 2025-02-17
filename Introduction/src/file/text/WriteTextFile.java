package file.text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/*
Ghi từng dòng vào file một cách hiệu quả.
Ưu điểm: Nhanh, kiểm soát tốt khi ghi từng dòng.
Nhược điểm: Phải tự thêm ký tự xuống dòng (\n).
Giải thích:
FileWriter: Mở file ở chế độ ghi (nếu chưa có thì sẽ tạo mới).
BufferedWriter: Ghi hiệu quả hơn bằng cách lưu vào bộ đệm rồi ghi một lần.
.write("..."): Ghi nội dung vào file.
.newLine(): Xuống dòng (tương đương \n).
 */
public class WriteTextFile {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/file/writetextfile.txt"))) {
            writer.write("Hello, World!");  // Ghi dòng đầu tiên
            writer.newLine();  // Xuống dòng
            writer.write("This is a text file.");  // Ghi dòng thứ hai
        } catch (IOException e) {
            e.printStackTrace();  // Xử lý ngoại lệ nếu không ghi được file
        }
    }
}
