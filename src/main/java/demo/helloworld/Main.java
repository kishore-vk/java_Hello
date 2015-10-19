package demo.helloworld;

public class Main {
	public static void main(String[] args) {
		System.out.println(printOne()+"\n");
		int a =10;
		int b =5;
		int c =0;
		c = Main1.add(a,b);//Invoking addition from Main1 Class
		System.out.println("Result of Addition is: "+c);
		c = Main2.sub(a,b);//Invoking Subtraction from Main2 Class
		System.out.println("Result of Subtraction is: "+c);
	}
	
	//HelloWorld Function
	public static String printOne() {
		String bs;
		bs = "Hello! Have a great weekend";
		return bs;
	}

}