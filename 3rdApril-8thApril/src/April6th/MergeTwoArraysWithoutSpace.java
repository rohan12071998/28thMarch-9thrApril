package April6th;

import java.util.Arrays;

public class MergeTwoArraysWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7};
		int b[] ={2,4,6,8};
		int i=a.length-1;
		int j=0;
		int temp=0;
		while(i>=j && j<a.length) {
			if(a[i]>b[j]) {
				temp=a[i];
				a[i]=b[j];
				b[j]=temp;
			}
			i--;
			j++;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.print(Arrays.toString(a));
		System.out.print(Arrays.toString(b));

	}

}
