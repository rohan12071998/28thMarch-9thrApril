package April8th;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		//int i=1;
		System.out.print (Factorial(n));

	}

	private static int  Factorial(int n) {
		// TODO Auto-generated method stub
		if(n==0) {
			return 1;
		}else {
			System.out.println(n);
			return (n*Factorial(n-1));
		}
		
	}

}
