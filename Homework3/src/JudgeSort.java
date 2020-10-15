import java.util.*;
public class JudgeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the numbers:");
		int sum=input.nextInt();
		int[] a=new int[sum];
		for(int i=0;i<sum;++i) {
			a[i]=input.nextInt();
		}
		int flag=1;
		for(int i=0;i<sum;++i) {
			if(a[i]>a[i+1]) {
				flag=0;
				break;
			}
		}
		if(flag==1)
			System.out.println("This list is already sorted");
		else
			System.out.println("This list is not sorted");
	}

}
