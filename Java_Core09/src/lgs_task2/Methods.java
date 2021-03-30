package lgs_task2;

public class Methods {

	private static int n1;
	private static int n2;

	public Methods(int a1, int b1) {
		n1 = a1;
		n2 = b1;
	}

	public int plus() throws MyException {
		Methods.check();
		return n1 + n2;
	}

	public int minus() throws MyException {
		Methods.check();
		return n1 - n2;
	}

	public double multiply() throws MyException {
		Methods.check();
		return n1 * n2;
	}

	public double devide() throws MyException {
		Methods.check();
		return n1 / n2;
	}

	static void viewCalcResult(double result) {
		System.out.println("Результ операции равен " + result);
	}

	static void check() throws MyException {
		if ((n1 < 0) && (n2 < 0)) {
			throw new IllegalArgumentException();
		}
		if (((n1 == 0) && (n2 != 0)) || ((n1 != 0) && (n2 == 0))) {
			throw new ArithmeticException();
		}
		if ((n1 == 0) && (n2 == 0)) {
			throw new IllegalArgumentException();
		}
		if ((n1 > 0) && (n2 > 0)) {
			throw new MyException("This calculator doesnt work!");
		}
	}

}