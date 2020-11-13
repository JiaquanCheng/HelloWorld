
public class maths {

	public maths() {
		// TODO Auto-generated constructor stub
	}

	public static double add(double a, double b) {
		return (a + b);//addition
	}

	public static double sub(double a, double b) {
		return (a - b);//subtraktion
	}
	public static double mul(double a, double b) {
		double result = 0;
		for (double i = a; i > 0; i--) {
			result = result + b;//multiplikation ohne *
		}
		return (result);
	}

	public static double pow (double d, double e) {
		double f= d;
		for (double i = 1; i < e; i++) { //hochzahl
			
			d = d * f;
		}
		return (d);
	}

	public static void main(String[] args) {
		double x = 5.0; //
		System.out.println(x);
		System.out.println(x + x);

		System.out.println(" 1.0 ^2.0 = " + pow(1.0, 2.0)); //rechnung
		System.out.println(" " + x + " ^2.0 = " + pow(x, 2.0));
		System.out.println(" 2.0 ^" + x + " = " + pow(2.0, x));
		x = pow(x, 2.0);
		System.out.println(x);

	}

}
