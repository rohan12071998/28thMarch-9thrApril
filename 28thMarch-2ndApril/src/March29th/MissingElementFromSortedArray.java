package March29th;

public class MissingElementFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,3,5,6,7,8,9};
		int result=missingnumber(a);
		System.out.println(result);

	}

	private static int missingnumber(int[] a) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid==0) {
				return mid;
			}
			if(a[mid]!=mid && a[mid-1]==mid-1) {
				return mid;
			}else if(a[mid]==mid) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	

	}

}
