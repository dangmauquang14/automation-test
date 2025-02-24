package corejava.interfaceVabtract.abstractt;

public abstract class Vehicle {
	abstract void move();  // Phương thức trừu tượng

    void fuel() {          // Phương thức đã triển khai
        System.out.println("Refueling...");
    }
}
