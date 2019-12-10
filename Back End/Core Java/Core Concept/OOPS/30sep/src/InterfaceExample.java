
public interface InterfaceExample {
	public void print();
	public void printNum();
	default void display() {
		System.out.println("Default method");
	}
	public static void show() {
		System.out.println("static method ");
	}

}
