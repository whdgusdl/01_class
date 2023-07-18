package Class_;

public class Method01 {
	public static void disp() {
		System.out.println("static method...");
	}
	public void output() {
		System.out.println("non-static method...");
	}
	public static void main(String[] args) {
		//호출
		Method01.disp();
		Method01 m = new Method01();
		m.output();
	}

}
