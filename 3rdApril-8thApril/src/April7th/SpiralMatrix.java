package April7th;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={ {1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
		SpiralMatix(a);

	}

	private static void SpiralMatix(int[][] a) {
		// TODO Auto-generated method stub
		int row=a.length;
		int col=a[0].length;
		
		int top=0;
		int bot=row-1;
		int left=0;
		int right=col-1;
		int dir=1;
		
		while(left<=right && top<=bot) {
			if(dir==1) {
				for(int i=left;i<=right;i++) {
					System.out.print((a)[top][i]+",");
				}
				top++;
				dir=2;
			}
			if(dir==2) {
				for(int i=top;i<=bot;i++) {
					System.out.print((a)[i][right]+",");
				}
				right--;
				dir=3;
			}
			if(dir==3) {
				for(int i=right;i>=left;i--) {
					System.out.print((a)[bot][i]+",");
				}
				bot--;
				dir=4;
			}
			if(dir==4) {
				for(int i=bot;i>=top;i--) {
					System.out.print((a)[i][left]+",");
				}
				left++;
				dir=1;
			}
			
		}
		
	}

}
