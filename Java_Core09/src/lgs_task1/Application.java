//Example of Java Code Convention

package lgs_task1;

import java.util.Scanner;

/**
 * @author anton
 * @since JDK 1.8.0.
 * */

public class Application {

static void menu() {
	// Menu
	System.out.println ("Enter 1 to check if the entered month exists");
	System.out.println ("Enter 2 to print all months with the same season");
	System.out.println ("Enter 3 to print all months with the same number of days");
	System.out.println ("Enter 4 to print all months with fewer days");
	System.out.println ("Enter 5 to print all months with more days");
	System.out.println ("Enter 6 to print the next season of the year");
	System.out.println ("Enter 7 to print the previous season");
	System.out.println ("Enter 8 to print all months with an even number of days");
	System.out.println ("Enter 9 to print all months with an odd number of days");
	System.out.println ("Enter 0 to check if the number of days in the entered month is even");
	}

	public static void main(String[] args) throws WrongInputConsoleParametersException {

		Scanner scanner = new Scanner(System.in);
		Months[] arrayMonths = Months.values();
		Seasons[] arraySeasons = Seasons.values();
		
		//creates an infinite loop that calls the menu method
		
		while (true) {
			menu();

			// takes the values from the scanner and runs the corresponding case 
			
			switch (scanner.nextInt()) {

			case 1: {
				System.out.println ("=== Program for checking the existence of the entered month ===");
				System.out.println ("Enter the month:");
				String month1 = scanner.next();

				boolean flag = isMonthExists(arrayMonths, month1);

				if (flag == true) {
					System.out.println ("The entered month exists!");
				} else {
				String message = "There is no such month!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 2: {
				System.out.println("=== ��������� ������ ���� ������� � ��������� ����� ���� ===");
				System.out.println("������� ���� ����:");
				String season2 = scanner.next();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getSeason().name().equalsIgnoreCase(season2)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("���� ���� " + season2 + " � ��������� �������:");

					for (Months months2 : arrayMonths) {
						if (months2.getSeason().toString().equalsIgnoreCase(season2)) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "����� ������� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 3: {
				System.out.println("=== ��������� ������ ���� ������� � ��������� ����������� ���� ===");
				System.out.println("������� ���������� ����:");
				int numberOfDays3 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays3) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("���������� ���� " + numberOfDays3 + " � ��������� �������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() == numberOfDays3) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "����� ������� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 4: {
				System.out.println("=== ��������� ������ ���� ������� � ����������� ���� ������ ���������� ===");
				System.out.println("������� ���������� ����:");
				int numberOfDays4 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays4 && numberOfDays4 >= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("���������� ���� ������ " + numberOfDays4 + " � ��������� �������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() < numberOfDays4) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "����� ������� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				break;
			}

			case 5: {
				System.out.println("=== ��������� ������ ���� ������� � ����������� ���� ������ ���������� ===");
				System.out.println("������� ���������� ����:");
				int numberOfDays5 = scanner.nextInt();

				boolean flag = false;

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() == numberOfDays5 && numberOfDays5 <= 30) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("���������� ���� ������ " + numberOfDays5 + " � ��������� �������:");

					for (Months months2 : arrayMonths) {
						if (months2.getNumberOfDays() > numberOfDays5) {
							System.out.println(months2);
						}
					}
				}

				if (flag == false) {
					String message = "����� ������� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 6: {
				System.out.println("=== ��������� ������ ��������� ���� ���� ===");
				System.out.println("������� ���� ����:");
				String season6 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season6)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("��������� ���� ����:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season6.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == (arraySeasons.length - 1)) {
						i = 0;
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i + 1]);
					}
				}

				if (flag == false) {
					String message = "����� ���� ���� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 7: {
				System.out.println("=== ��������� ������ ���������� ���� ���� ===");
				System.out.println("������� ���� ����:");
				String season7 = scanner.next();

				boolean flag = false;

				for (Seasons seasons : arraySeasons) {
					if (seasons.name().equalsIgnoreCase(season7)) {
						flag = true;
					}
				}

				if (flag == true) {
					System.out.println("���������� ���� ����:");

					Seasons seasons2 = Seasons.valueOf(firstUpperCase(season7.toLowerCase()));
					int i = seasons2.ordinal();

					if (i == 0) {
						i = (arraySeasons.length - 1);
						System.out.println(arraySeasons[i]);
					} else {
						System.out.println(arraySeasons[i - 1]);
					}
				}

				if (flag == false) {
					String message = "����� ���� ���� ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			case 8: {
				System.out.println("=== ��������� ������ ������� � ������ ����������� ���� ===");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 == 0) {
						System.out.println(months);
					}
				}

				break;
			}

			case 9: {
				System.out.println("=== ��������� ������ ������� � �������� ����������� ���� ===");

				for (Months months : arrayMonths) {
					if (months.getNumberOfDays() % 2 != 0) {
						System.out.println(months);
					}
				}

				break;
			}

			case 10: {
				System.out.println("=== ��������� �������� �������� ���������� ���� � ��������� ������ ===");
				System.out.println("������� �����:");
				String month0 = scanner.next();

				boolean flag = isMonthExists(arrayMonths, month0);

				if (flag == true) {
					Months month = Months.valueOf(firstUpperCase(month0.toLowerCase()));

					if (month.getNumberOfDays() % 2 == 0) {
						System.out.println("���������� ���� � ������ " + month0 + " - " + month.getNumberOfDays()
								+ ". ��� ����� - ������");
					} else {
						System.out.println("���������� ���� � ������ " + month0 + " - " + month.getNumberOfDays()
								+ ". ��� ����� - ��������");
					}
				}

				if (flag == false) {
					String message = "������ ������ ���!";
					throw new WrongInputConsoleParametersException(message);
				}
				
				break;
			}

			default: {
				System.out.println("������� ����� �� 0 �� 9!");

				break;
			}

			}
		}
	}

	// Checks if the month exists in array and returns a boolean expression
	 

	static boolean isMonthExists(Months[] arrayMonths, String month) {
		boolean flag = false;

		for (Months months : arrayMonths) {
			if (months.name().equalsIgnoreCase(month)) {
				flag = true;
			}
		}

		return flag;
	}

	// Converts the first character of a string to upper case
	
	static String firstUpperCase(String string) {
		if (string == null || string.isEmpty()) {
			return string;
		} else {
			return string.substring(0, 1).toUpperCase() + string.substring(1);
		}
	}

}