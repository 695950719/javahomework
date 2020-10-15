import java.util.*;
public class StundentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int sum=input.nextInt();
		String[] name=new String[sum];
		int[] score=new int[sum];
		for(int i=0;i<sum;++i) {
			name[i]=input.next();
		}
		for(int i=0;i<sum;++i) {
			score[i]=input.nextInt();
		}
		int m,i,j;
		String t;
		for(i=0;i<sum-1;i++)
			for(j=0;j<sum-1-i;j++)
				if(score[j]>score[j+1])
				{
					m=score[j];
					score[j]=score[j+1];
					score[j+1]=m;
					t=name[j];
					name[j]=name[j+1];
					name[j+1]=t;

		
				}
		for(i=0;i<sum;i++)
			System.out.println(name[i]);

}
}