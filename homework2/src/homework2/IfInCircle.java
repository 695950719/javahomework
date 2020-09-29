package homework2;
import java.util.*;
public class IfInCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double h=x*x+y*y;
		if(h<100)
			System.out.println("point （"+x+","+y+") is in the circle");	
		else
			System.out.println("point （"+x+","+y+") is not in the circle");	
		
	}

}
