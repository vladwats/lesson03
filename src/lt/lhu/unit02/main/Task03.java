package lt.lhu.unit02.main;

import java.util.Scanner;

public class Task03 {
	// a,b,c заранее определены
	public static void main(String[] args) {
		double a = 10; 
		double b = 15; 
		double c = 20; 
		double F;
		F = Math.pow(a,2)-Math.pow(b-c,2)+Math.log(Math.pow(b,2)+1);
		System.out.println(F);
	}

}


class Task03_2 {
	// a,b,c не определены, вводятся пользователем

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			double a = scanner.nextDouble(); 
			double b = scanner.nextDouble(); 
			double c = scanner.nextDouble(); 
			double F;
			F = Math.pow(a,2)-Math.pow(b-c,2)+Math.log(Math.pow(b,2)+1);
			System.out.println(F);
		}
	}

}
