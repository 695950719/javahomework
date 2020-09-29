package homework2;
import java.util.*;
public class TwoRecCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter r1's center x,y,width,and height");
		double x1 =input.nextDouble();
		double y1 =input.nextDouble();
		double w1 =input.nextDouble();
		double h1 =input.nextDouble();
		System.out.println("Enter r2's center x,y,width,and height");
		double x2 =input.nextDouble();
		double y2 =input.nextDouble();
		double w2 =input.nextDouble();
		double h2 =input.nextDouble();
		double temp = Math.pow((x1 - x2), 2) + Math.pow((y2 - y1), 2); 
		double distance = Math.pow(temp, 0.5); 

		if (distance <= Math.abs(w1 - w2)) 
		System.out.println("circle2 is inside circle1"); 
		else if (distance <= (w1 + w2)) 
		System.out.println("circle2 overlaps circle1"); 
		else 
		System.out.println("circle2 does not overlap circle1");
	}

}
