package corejava.oop;

public class Abstraction {
	// Giải thích: Interface Payment định nghĩa phương thức pay() mà không quan tâm
	// chi tiết thanh toán. Class CreditCardPayment và PaypalPayment triển khai chi
	// tiết này theo cách riêng của chúng.
	
	public interface Payment {
		void pay(int amount);
	}

	public static class CreditCardPayment implements Payment {
		@Override
		public void pay(int amount) {
			System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng");
		}
	}

	public static class PaypalPayment implements Payment {
		@Override
		public void pay(int amount) {
			System.out.println("Thanh toán " + amount + " bằng Paypal");
		}
	}

	public static void main(String[] args) {
		Payment payment = new CreditCardPayment();
		payment.pay(100); // Kết quả: "Thanh toán 100 bằng thẻ tín dụng"

		payment = new PaypalPayment();
		payment.pay(200); // Kết quả: "Thanh toán 200 bằng Paypal"
	}
}
