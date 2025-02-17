package file.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelExample {
	public static void main(String[] args) {
		try {
			// Đọc file Excel
			FileInputStream file = new FileInputStream(new File("src/file/excel/sample_data.xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			Sheet sheet = workbook.getSheetAt(0); // Lấy sheet đầu tiên

			// Tạo đối tượng DataFormatter để định dạng giá trị ô. Sử dụng DataFormatter: Để
			// đảm bảo rằng các giá trị được lấy ra là chuỗi (dù là số hay chuỗi) mà không
			// bị lỗi kiểu dữ liệu.
			DataFormatter dataFormatter = new DataFormatter();

			// Duyệt qua tất cả các hàng
			for (Row row : sheet) {
				// Lấy giá trị của từng cột theo thứ tự Name, Age, City
				String name = dataFormatter.formatCellValue(row.getCell(0)); // Cột 0 - Name
				String age = dataFormatter.formatCellValue(row.getCell(1)); // Cột 1 - Age
				String city = dataFormatter.formatCellValue(row.getCell(2)); // Cột 2 - City

				// Hiển thị thông tin theo thứ tự Name, Age, City
				System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
			}

			// Đóng workbook và file
			workbook.close();
			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
