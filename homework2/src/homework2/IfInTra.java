package homework2;
import java.util.*;
public class IfInTra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a point with two coordinates:");
		double x=input.nextDouble();
		double y=input.nextDouble();
		if((x>0)&(y>0)&(y<-0.5*x+100))
			System.out.println("The point is in the triangle");	
		else
			System.out.println("The point is not in the triangle");	
	}

}
