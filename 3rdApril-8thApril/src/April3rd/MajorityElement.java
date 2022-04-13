package April3rd;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,2,2,2,4,5,6,73,2,2,2,2};
		int n=a.length;
		findMajority(a,n);

	}

	private static void findMajority(int[] a, int n) {
		// TODO Auto-generated method stub
		int maxcount=0;
		int index=-1;
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxcount) {
				maxcount=count;
				index=i;
			}
			
		}
		if(maxcount > n/2) 
			System.out.println(a[index]);
		else
			System.out.print("no majority found");
	}

}
