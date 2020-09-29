package homework2;
import java.util.*;
public class RoundLenth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if((a+b>c)&(a+c>b)&(b+c>a))
			System.out.println(a+b+c);
		else
			System.out.println("数据非法");
		
			
	}

}
