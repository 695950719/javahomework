import java.util.*;
public class Merger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.print("Enter list1:");
		int sum;
		sum=input.nextInt();
		int[] l1=new int[sum];
		for(int i=0;i<sum;++i)
			l1[i]=input.nextInt();
		
		System.out.print("Enter list2:");		
		sum=input.nextInt();
		int[] l2=new int[sum];
		for(int i=0;i<sum;++i)
			l2[i]=input.nextInt();
		merge(l1,l2);
	}
	public static int[] merge(int[] list1,int[] list2) {
		int sum=list1.length+list2.length;
		int[] l3=new int[sum];
		sum=0;
		for(int i=0;i<list1.length;++i) {
			l3[sum++]=list1[i];			
			}
		for(int i=0;i<list2.length;++i)
			l3[sum++]=list2[i];
		for(int i=0;i<sum-1;i++)
			for(int j=0;j<sum-1-i;j++)
				if(l3[j]>l3[j+1])
				{
					int m=l3[j];
					l3[j]=l3[j+1];
					l3[j+1]=m;
				}
		for(int i=0;i<sum;++i)
			System.out.print(l3[i]+" ");
		return l3;
	}

}
