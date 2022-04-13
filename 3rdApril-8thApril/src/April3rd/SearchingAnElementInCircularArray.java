package April3rd;

public class SearchingAnElementInCircularArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {9,10,11,2,5,7,8};
		int n=11;
		int result=SearchingElement(a,n);
		System.out.println(result);

	}

	private static int  SearchingElement(int[] a, int n) {
		// TODO Auto-generated method stub
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(a[mid]==n) {
				return mid;
			}
			if(a[mid]<=a[end]) {
				if(n>a[mid] && n<=a[end]) {
					start=mid+1;	
				}else {
					end=mid-1;
				}
				
			}else {
				if(n>=a[start] && n<a[mid]) {
					start=mid+1;	
				}else {
					end=mid-1;
				}
			}
		}
		return -1;
		
		
	}

}
