
public class hi {

	public hi() {

	}

	public static double add(double a, double b) {
		return (a + b);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			double randomValue = Math.random();
			System.out.println(randomValue);
			if (randomValue >= 0.42) {
				System.out.println("Gewonnen!");
			} else
				System.out.println("Verloren!");
		}
	}
}
