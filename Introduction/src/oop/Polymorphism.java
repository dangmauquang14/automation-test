package oop;

public class Polymorphism {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum of integers: " + calc.add(2, 3));
		System.out.println("Sum of doubles: " + calc.add(2.5, 3.5));
		
        BasePage page = new LoginPage();
        page.openPage(); // Kết quả: "Mở trang đăng nhập"
	}
	
	// Overloading
	// Giải thích: Phương thức add() có hai phiên bản: một cho int và một cho double.
	public static class Calculator {
		public int add(int a, int b) {
			return a + b;
		}

		public double add(double a, double b) {
			return a + b;
		}
	}
	
	// Overriding
	// Giải thích: Phương thức openPage() được ghi đè trong class LoginPage, nên khi gọi sẽ 
	// thực hiện phiên bản ghi đè đó.
	public static class BasePage {
	    public void openPage() {
	        System.out.println("Mở trang web mặc định");
	    }
	}
	public static class LoginPage extends BasePage {
	    @Override
	    public void openPage() {
	        System.out.println("Mở trang đăng nhập");
	    }
	}
}
