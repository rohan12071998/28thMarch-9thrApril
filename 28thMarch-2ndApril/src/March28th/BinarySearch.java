package March28th;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,12,45,67,89,99};
		System.out.print("Enter The Number of Which You Want To Find The Index :");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int number=SearchIndex(arr,n);
		System.out.print(number);
	}

	private static int SearchIndex(int[] arr, int n) {
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==n) {
				return mid;
			}else if(n>arr[mid]) {
				start=mid+1;
				
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

}
