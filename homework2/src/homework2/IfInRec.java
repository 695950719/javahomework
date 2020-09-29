package homework2;
import java.util.*;
public class IfInRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if((x<5)&(x>-5)&(y<2.5)&(y>-2.5))
			System.out.println("point （"+x+","+y+") is in the circle");	
		else
			System.out.println("point （"+x+","+y+") is not in the circle");	
	}	

}
