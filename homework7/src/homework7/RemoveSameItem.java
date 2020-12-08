package homework7;

import java.util.Scanner;

public class RemoveSameItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array=new int[10];
		Scanner input=new Scanner(System.in);
		System.out.println("enter ten integers:");
		for(int i=0;i<10;++i) {
			array[i]=input.nextInt();
		}
		removeDuplicate(array);
	}
	public static void removeDuplicate(int [] array) {
		int []temarr=new int[array.length];
		int t=0;
		for(int i=0;i<array.length;++i) {
			boolean isonly=true;
			for(int j=i+1;j<array.length;++j) {
				if(array[i]==array[j]) {
					isonly=false;
					break;
				}
			}
			if(isonly) {
				temarr[t]=array[i];
				t++;
			}
			
		}
		int [] newArr = new int[t];
		  System.arraycopy(temarr, 0, newArr, 0, t);
		System.out.print("the distinct interges are: ");
		for(int i =0;i<newArr.length;++i)
			System.out.print(newArr[i]+" ");
	}

}
