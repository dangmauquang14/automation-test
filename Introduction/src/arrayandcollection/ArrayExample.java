package arrayandcollection;

/*
Định nghĩa: Array là một cấu trúc dữ liệu tĩnh (static), có thể lưu trữ một tập hợp các giá trị cùng kiểu dữ liệu.
Kích thước: Kích thước của mảng là cố định, nghĩa là bạn phải xác định số phần tử khi tạo mảng và không thể thay 
đổi sau khi đã tạo.
Truy cập phần tử: Các phần tử trong mảng được truy cập bằng chỉ số (index), bắt đầu từ 0.
Đặc điểm:
Tĩnh: Không thể thay đổi kích thước của mảng sau khi đã tạo.
Loại dữ liệu đồng nhất: Tất cả phần tử trong mảng phải có cùng kiểu dữ liệu.
Hiệu suất: Do là cấu trúc dữ liệu tĩnh, việc truy cập phần tử trong mảng rất nhanh.
 */
public class ArrayExample {
	public static void main(String[] args) {
		// Khai báo và khởi tạo mảng
		int[] numbers = { 1, 2, 3, 4, 5 };

		// Truy cập phần tử trong mảng
		System.out.println(numbers[2]); // Output: 3
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
