package assignment18;

import java.util.Random;

public class Assignment18 {
	public static void main(String[] args) {
		System.out.println("abslute value of -12 :\t" + Math.abs(-12));
		System.out.println("tan(pi/4) : \t" + Math.tan(Math.PI / 4));
		System.out.println("sin(pi/2) : \t" + Math.sin(Math.PI / 2));
		System.out.println("cos(pi) : \t" + Math.cos(Math.PI));

		System.out.println();

		System.out.println("range : [0,99]\t\t" + (int) (Math.random() * 100));// 0~99
		System.out.println("range : [1,100]\t\t" + (int) (Math.random() * 100 + 1));// 1~100
		System.out.println("range : [-1,-100]\t" + (int) (Math.random() * -100 - 1));// -1~-100

		System.out.println();

		Random r = new Random();
		System.out.println("range : [0,99] \t\t" + r.nextInt(99));// 0~99
		System.out.println("range : [1,100]\t\t" + r.nextInt(99) + 1);// 1~100
		System.out.println("range : [-1,-100]\t" + (-r.nextInt(100) - 1));// -1~-100

	}
}
