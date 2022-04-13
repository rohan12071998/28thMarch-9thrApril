package April8th;

public class OddNumberTill31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=31;
		OddNumber(i,n);

	}

	private static void OddNumber(int i, int n) {
		// TODO Auto-generated method stub
		if(i==n) {
			System.out.print(i);
		}else {
			System.out.println(i);
			OddNumber(i+2,n);
		}
		
	}

}
