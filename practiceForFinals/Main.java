package practiceForFinals;

public class Main {
	public static void main(String[] args) {
		Cellphone x = new Cellphone("iPhone", 6.1, "Blue");
		
		/*
		x.turnOn();
		x.setBrand("Xiaomi");
		x.setColor("Black");
		x.setScreenSize(5.99);
		*/
		
		System.out.println(x.brand);
		System.out.println(x.color);
		System.out.println(x.screenSize);
		
		System.out.println("\nI was gifted a " + x.screenSize + " inches " + x.brand + " that's color " + x.color);
		
	}
}
