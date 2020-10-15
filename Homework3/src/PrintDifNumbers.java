import java.util.*;
public class PrintDifNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[10];
		
		System.out.println("Enter the numbers:");
		for(int i=0;i<10;++i) {
			numbers[i]=input.nextInt();
		}
		int size=numbers.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(numbers[i]==numbers[j]) {
					for(int k=j+1;k<size;k++) {
						numbers[k-1]=numbers[k];
					}
					size--;
				}
			}
		}
		System.out.println(size);
		System.out.print("The distinct numbers are:");
		for(int i=0;i<size;++i) {
			System.out.print(numbers[i]+" ");
		}
	}

}
