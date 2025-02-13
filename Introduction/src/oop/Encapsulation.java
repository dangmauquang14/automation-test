package oop;

public class Encapsulation {
	public static class User {
		private String username;
		private String password;

		// Constructor
		public User(String username, String password) {
			this.username = username;
			this.password = password;
		}

		// Getter và Setter
		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
	}

	// Sử dụng trong test case
	// Giải thích: Ở đây, thuộc tính username và password được đóng gói bên trong class User. 
    // Bên ngoài chỉ có thể truy cập thông qua các phương thức getUsername(), getPassword().

	public static void main(String[] args) {
		User user = new User("admin", "admin123");
		System.out.println("Username: " + user.getUsername());
		System.out.println("Password: " + user.getPassword());
	}
}
