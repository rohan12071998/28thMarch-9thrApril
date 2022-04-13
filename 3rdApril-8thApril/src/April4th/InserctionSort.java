package April4th;

import java.util.Arrays;

public class InserctionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,2,7,9,10,1};
		int b[]=InserctionSort(a);
		System.out.println(Arrays.toString(b));

	}

	private static int[] InserctionSort(int[] a) {
		// TODO Auto-generated method stub
		int key=0;
		for(int i=1;i<a.length;i++) {
			key=a[i];
			int j=i-1;
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
		return a;
	}

}
