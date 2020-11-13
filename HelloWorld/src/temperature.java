
public class temperature {

	public temperature() {
	}

	public static boolean isLeapYear(int number) {
		if (number % 4 > 0) {
			return false;
		} else {
			if (number % 100 > 0) {
				return true;
			} else {
				if (number % 400 > 0) {
					return false;
				} else {
					return true;
				}
			}
		}
	}

	public static void main(String[] args) {
		while (true) {
			int number = Terminal.askInt("Gib eine Jahreszahl ein");
			if (isLeapYear(number)) {
				System.out.println(number + " ist ein Schaltjahr");
			} else
				System.out.println(number + " ist kein Schaltjahr");
		}
	}
}
