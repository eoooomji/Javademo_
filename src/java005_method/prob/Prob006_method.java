package java005_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		for(int i = 2; i <= num ; i++) {
			for(int j = 2 ; j <= i ; j++) {
				if( i != j && i % j == 0 ) {
					break;
				}
				if(i == j) {
					System.out.println(i);
				}
			}
		}

	}// end primeNumber( )
}//end class

