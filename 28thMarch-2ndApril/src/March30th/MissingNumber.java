package March30th;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,3,4,5,6,7,8,9};
		int result=missingnumber(a);
		System.out.println(result);

	}

	private static int missingnumber(int[] a) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid==0) {
				return mid+1;
			}
			if(a[mid]!=mid+1 && a[mid-1]==mid) {
				return mid+1;
			}else if(a[mid]==mid+1) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

}
