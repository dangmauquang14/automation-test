package file.excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelExample {
    public static void main(String[] args) {
        // Tạo một workbook mới
        Workbook workbook = new XSSFWorkbook();

        // Tạo một sheet mới trong workbook
        Sheet sheet = workbook.createSheet("Sheet1");

        // Tạo tiêu đề cột
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Name");
        headerRow.createCell(1).setCellValue("Age");
        headerRow.createCell(2).setCellValue("City");

        // Dữ liệu mẫu
        Object[][] data = {
            {"John Doe", 28, "New York"},
            {"Jane Smith", 34, "Los Angeles"},
            {"Alice Johnson", 29, "Chicago"},
            {"Bob Brown", 42, "Houston"}
        };

        // Ghi dữ liệu vào các hàng bắt đầu từ hàng 1
        int rowNum = 1;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue((String) rowData[0]);  // Name
            row.createCell(1).setCellValue((Integer) rowData[1]); // Age
            row.createCell(2).setCellValue((String) rowData[2]);  // City
        }

        // Ghi file vào ổ đĩa
        try (FileOutputStream fileOut = new FileOutputStream("src/file/excel/sample_output.xlsx")) {
            workbook.write(fileOut);
            System.out.println("File Excel đã được ghi thành công!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                workbook.close();  // Đảm bảo đóng workbook sau khi ghi xong
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
