package April7th;

import java.util.Scanner;

public class ConvertingRowsAndColmTo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{0,0,0},{0,0,1}};
		Sorting(a);
		}
	private static void Sorting(int[][] a) {
		// TODO Auto-generated method stub
			int row=0;
			int col=0;
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					if(a[i][j]==1) {
						row=i;
						col=j;
					}
				}
			}
			for(int i=0; i<a.length;i++) {
				a[i][col]=1;
			}
			for(int j=0; j<a.length;j++) {
				a[row][j]=1;
			}
			for(int i=0;i<a.length;i++) {
				for(int j=0;j<a.length;j++) {
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		
	}
	

	


}
