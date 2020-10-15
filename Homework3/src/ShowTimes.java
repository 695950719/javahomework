import java.util.*;
public class ShowTimes {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[101];
		int t=-1;
		System.out.println("Enter the integers between 1 and 100:");
		t=input.nextInt();
		for(int i=0;i<=100;i++)
			numbers[i]=0;
		while(t!=0) {
			numbers[t]+=1;
			t=input.nextInt();
		}
		for(int i=1;i<=100;i++) {
			if(numbers[i]==1) {
				System.out.println(i+" occurs "+numbers[i]+" time");
			}
			if(numbers[i]>1) {
				System.out.println(i+" occurs "+numbers[i]+" times");
			}
		}
		
	}

}
