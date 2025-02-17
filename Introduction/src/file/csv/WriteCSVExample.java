package file.csv;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVExample {
    public static void main(String[] args) {
        // Đường dẫn tới file CSV
        String file = "src/file/csv/output.csv";
        
        // Tạo dữ liệu cần ghi vào file CSV
        String[] header = {"Name", "Age"};
        String[] data1 = {"John Doe", "30"};
        String[] data2 = {"Jane Smith", "25"};
        // Tạo đối tượng CSVWriter để ghi dữ liệu vào file output.csv.
        try (CSVWriter writer = new CSVWriter(new FileWriter(file))) {
            // Ghi header vào file
            writer.writeNext(header);
            
            // Ghi các dòng dữ liệu vào file
            writer.writeNext(data1);
            writer.writeNext(data2);
            
            System.out.println("Đã ghi dữ liệu vào file output.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
