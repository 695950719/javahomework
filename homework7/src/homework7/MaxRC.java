package homework7;
import java.util.*;
public class MaxRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the array size n:");
		int n=input.nextInt();
		int [][] array=new int[n][n];
		System.out.println("the random array is:");
		for(int i=0;i<n;++i) {
			for(int j=0;j<n;++j) {
				array[i][j]=(int)(Math.random()*2);
				System.out.print(array[i][j]+" ");
			}
			System.out.println();				
		}
		System.out.println("the largest row is "+max(array,true));
		System.out.println("the largest column is "+max(array,false));
	
}
	private static int max(int[][] array, boolean rowCol) {
		int max;
		int temp = 0, cou = -1;
		for (int i = 0; i < array.length; i++) {
			max = 0;
			for (int j = 0; j < array[i].length; j++) {
				int index = (rowCol) ? array[i][j] : array[j][i];
				if (index == 1)
					max++;
			}
			if (temp < max) {
				temp = max;
				cou = i;
			}
		}
		return cou;
	}
}