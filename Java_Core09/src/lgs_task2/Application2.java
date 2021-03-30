package lgs_task2;

import java.util.Scanner;

public class Application2 {

		public static void main(String[] args) throws MyException {

			Scanner scanner = new Scanner(System.in);

			int n1;
			int n2;

			System.out.println("Enter the first integer:");

			if (scanner.hasNextInt()) {
				n1 = scanner.nextInt();

				System.out.println("Enter the second integer:");

				if (scanner.hasNextInt()) {
					n2 = scanner.nextInt();

					Methods calc = new Methods(n1, n2);

					Methods.viewCalcResult(calc.plus());
					Methods.viewCalcResult(calc.minus());
					Methods.viewCalcResult(calc.multiply());
					Methods.viewCalcResult(calc.devide());
				}

				else
					System.err.println("Mistake! It was necessary to enter an INTEGER number!!!");
			}

			else
				System.err.println("Mistake! It was necessary to enter an INTEGER number!");

		}
	
}
