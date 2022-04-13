package March28th;

import java.util.Scanner;

public class CubeRootUsingBinarySearch {

	public static void main(String[] args) {
		System.out.print("Enter The Number Of Which You Want To Find Square root :");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int cbrt=SearchCubeRoot(num);
		System.out.print(cbrt);
	}

	private static int SearchCubeRoot(int num) {
		int start=1;
		int end=num;
		while(start<=end) {
			int mid=(start+end)/2;
			if(mid*mid*mid==num) {
				return mid;
			}else if(num>mid*mid*mid) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

}
