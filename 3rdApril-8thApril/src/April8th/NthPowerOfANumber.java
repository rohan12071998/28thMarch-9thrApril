package April8th;

import java.util.Scanner;

public class NthPowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		//int p= sc.nextInt();
		System.out.print(power(n));

	}

	private static int power(int n) {
		// TODO Auto-generated method stub
		if(n==1) {
			return 2;
		}else {
			return(2*(power(n-1)));
		}
	}

}
