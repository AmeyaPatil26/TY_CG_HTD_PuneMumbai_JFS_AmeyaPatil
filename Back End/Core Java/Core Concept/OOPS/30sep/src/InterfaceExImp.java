
public class InterfaceExImp implements InterfaceExample {

	@Override
	public void print() {
		System.out.println("Implemented print");
	}

	/*
	 * @Override // we cannot override method in interface public static void show()
	 * { System.out.println("static in impl"); }
	 */
	@Override
	public void display() {
		System.out.println("implemented display method of interface");
	}

	public static void main(String[] args) {
		InterfaceExample ie= new InterfaceExImp();
		ie.display();
		new InterfaceExImp().print();
		new InterfaceExImp().display();
		new InterfaceExImp().printNum();
	}

	@Override
	public void printNum() {
		System.out.println("4451245");
	}
}
