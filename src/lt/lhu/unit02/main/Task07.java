package lt.lhu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		// Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, 
		// и в четвертую степень — отрицательные.
		
		double a = 10;
		double b = 7;
		double c = -5;
		if (a>=0) {
			System.out.println(Math.pow(a,2));
		} else {
			System.out.println(Math.pow(a,4));
		}
		
		if (b>=0) {
			System.out.println(Math.pow(b,2));
		} else {
			System.out.println(Math.pow(b,4));
		}
		if (c>=0) {
			System.out.println(Math.pow(c,2));
		} else {
			System.out.println(Math.pow(c,4));
		}

	}

}
