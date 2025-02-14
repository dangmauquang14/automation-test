package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) {
		/*
		Đọc từng dòng giúp tiết kiệm bộ nhớ khi file lớn.
		Ưu điểm: Nhanh, hiệu quả.
		Nhược điểm: Phải xử lý từng dòng một.
		Giải thích:
		FileReader: Đọc file theo từng ký tự.
		BufferedReader: Đọc theo từng dòng (nhanh hơn).
		.readLine(): Đọc một dòng từ file.
		.close(): Tự động đóng file khi dùng try-with-resources.
		 */
		try (BufferedReader reader = new BufferedReader(
				new FileReader("src/file/example.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) { // Đọc từng dòng
				System.out.println(line); // In ra màn hình
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
