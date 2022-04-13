package March29th;

public class MissingTearmInASequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,11,13};
		int result=(missingNumber(arr));
		System.out.print(result);
		

	}

	private static int missingNumber(int[] arr) {
		int start=0;
		int end=arr.length-1;
		int misingno=(arr[arr.length-1] -arr[0])/arr.length;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid+1] - arr[mid] !=misingno) {
				return arr[mid+1]-misingno;
			}
			if(arr[mid] - arr[mid-1] !=misingno) {
				return arr[mid-1]+misingno;
			}
			if(arr[mid]-arr[0]!=(mid-0)*misingno) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}

}
