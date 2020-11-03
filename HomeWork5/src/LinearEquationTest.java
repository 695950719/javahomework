import java.util.*;
public class LinearEquationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a=input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		int d=input.nextInt();
		int e=input.nextInt();
		int f=input.nextInt();
		LinearEquation demo=new LinearEquation(a,b,c,d,e,f);
		if(demo.isSolvable()) {
			System.out.println(demo.getX()+" "+demo.getY());
		}


		

	}

}
