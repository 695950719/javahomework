import java.util.*;
public class QuadraticEquationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("please enter 3 numbers:");
			
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		QuadraticEquation demo=new QuadraticEquation(a,b,c);
		if(demo.getRoot1()!=0)
			System.out.println(demo.getRoot1());
		if(demo.getRoot2()!=0)
			System.out.println(demo.getRoot2());
		if(demo.getRoot1()==0&&demo.getRoot2()==0)
			System.out.println("无解");
		
	}

}
