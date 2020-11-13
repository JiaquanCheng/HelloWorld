
public class Arrays {

	public Arrays() {
		
	}

	public static void main(String[] arg) {
		
		int[] bla = new int [10001];
		
		for(int i=0; i<bla.length; i++) {
		bla[i]= i;
		}
		for(int i=0; i<=10000; i++) {

		System.out.println(bla[i]);
		}
	}

}
