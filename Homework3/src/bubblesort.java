import java.util.*;
public class bubblesort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		
	
		int[] score=new int[100];
		int sum=score.length;
		for(int i=0;i<sum;++i) {
			score[i]=input.nextInt();
		}
		int m,i,j;
	
		for(i=0;i<sum-1;i++)
			for(j=0;j<sum-1-i;j++)
				if(score[j]>score[j+1])
				{
					m=score[j];
					score[j]=score[j+1];
					score[j+1]=m;
				

		
				}
		for(i=0;i<sum;i++)
			System.out.println(score[i]);

}
}
