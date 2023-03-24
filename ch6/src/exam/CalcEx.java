package exam;

import java.util.Scanner;

public class CalcEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Num1 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		System.out.println("Input Num2 : ");
		int num2 = Integer.parseInt(sc.nextLine());
		System.out.println("Input operator : ");
		String op = sc.nextLine();
		
		
		Calc calc = null; //다형성
		switch (op) {
		case "+":
			calc = new Add();
			break;
		case "-":
			calc = new Sub();
			break;
		case "*":
			calc = new Mul();
			break;
		case "/":
			calc = new Div();
			break;
		}
		calc.setValue(num1, num2);
		System.out.println("결과 "+calc.calculate());

	}

}
