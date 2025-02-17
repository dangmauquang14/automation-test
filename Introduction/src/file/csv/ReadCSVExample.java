package file.csv;

import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class ReadCSVExample {
	public static void main(String[] args) {
		// Đường dẫn tới file CSV
		String file = "src/file/csv/data.csv";
		// Tạo đối tượng CSVReader để đọc file data.csv.
		try (CSVReader reader = new CSVReader(new FileReader(file))) {
			// Đọc tất cả dòng trong file CSV
			String[] line;
			try {
				// String[] line = reader.readNext();: Dùng readNext() để đọc một dòng dữ liệu
				// từ file CSV. Mỗi dòng được chia thành các trường và lưu vào một mảng String[].
				// Trong ví dụ này, giả sử rằng mỗi dòng trong file CSV có 2 trường (Name và Age).
				while ((line = reader.readNext()) != null) {
					// In từng dòng trong file
					System.out.println("Name: " + line[0] + ", Age: " + line[1]);
				}
			} catch (CsvValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
