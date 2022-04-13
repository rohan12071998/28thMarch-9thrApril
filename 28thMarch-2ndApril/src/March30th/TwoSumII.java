package March30th;

import java.util.Arrays;

public class TwoSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,7,11,15};
		int n=17;
		System.out.print(searchIndex(Arrays.toString*(a,n)));

	}

	private static int[] searchIndex(int[] a, int n) {
		int start=0;
		int end=a.length-1;
		int ans[]=new int[2];
		while(start<=end) {
			if(a[start]+a[end]==n) {
				ans[0]=start+1;
				ans[1]=end+1;
				return ans;
			}else if(a[start]+a[end]>n) {
				end--;
			}else {
				start++;
			}
		}
		return ans;
	}

}
