package demo.helloworld;

public class Main {

	public static void main(String[]args) {
		System.out.println(printOne());
		int b = add();
		System.out.println(b);
	}

	public static String printOne() {
		String bs;
		bs = "Hello! Manoj & Arif";
		return bs;
	}

	public static int add() {
		int c = 8 + 6;
		return c;
	}

}