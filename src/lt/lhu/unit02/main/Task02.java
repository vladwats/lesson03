package lt.lhu.unit02.main;

public class Task02 {

	public static void main(String[] args) {
		// Напишите программу нахождения гипотенузы и площади прямоугольного треугольника по двум катетам. 
		double a = 3; double b = 4;
		double c;
		double S;
		c= Math.sqrt(Math.pow(a, 2)+ Math.pow(b, 2));
		S = (a*b)/2;
		System.out.println("hypotenuse " + c);
		System.out.println("square " + S);				

	}

}
