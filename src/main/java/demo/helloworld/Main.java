package demo.helloworld;

/*
Java program to display Hello World, Addition and Subtraction
*/

public class Main {
	public static void main(String[] args) {
		int a = 10, b = 5, c = 0;
		System.out.println(printOne() + "\n");
		// /* Invoking addition from Main1 Class */
		c = Main1.add(a, b);
		System.out.println("Result of Addition is: " + c + "\n");
		// /*Invoking Subtraction from Main2 Class*/
		c = Main2.sub(a, b);
		System.out.println("Result of Subtraction is: " + c);
	}

	// HelloWorld Function
	public static String printOne() {
		String bs;
		bs = "Hello! Have a splendid week ahead";
		return bs;
	}

}
