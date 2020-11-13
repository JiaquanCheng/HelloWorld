
public class zweierpotenz {

	public static boolean isLeapYear(int number) {
		if (number % 4 > 0 && number % 100 == 0) {
			return false;
		} else {
				if (number % 400 > 0) {
					return false;
				} else {
					return true;
				}
			}
		}

	public static void main(String[] args) {

		int number = Terminal.askInt("Gib eine Jahreszahl ein");
		if (isLeapYear(number)) {
			System.out.println(number + " ist ein Schaltjahr");
		} else
			System.out.println(number + " ist kein Schaltjahr");
	}

}

