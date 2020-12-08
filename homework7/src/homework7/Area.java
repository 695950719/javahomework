package homework7;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("enter the number of point:");
		int n=input.nextInt();
		System.out.println("enter the coordinates of the points:");
		double [] x=new double [n];
		double [] y=new double [n];
		for(int i=0;i<n;++i) {
			x[i]=input.nextDouble();
			y[i]=input.nextDouble();
		}
		double sumarea=0;
		for(int i=1;i<n-2;++i) {
			double a,b,c;
			a=Math.sqrt((x[i]-x[0])*(x[i]-x[0])+(y[i]-y[0])*(y[i]-y[0]));
			b=Math.sqrt((x[i+1]-x[0])*(x[i+1]-x[0])+(y[i+1]-y[0])*(y[i+1]-y[0]));
			c=Math.sqrt((x[i+1]-x[i])*(x[i+1]-x[i])+(y[i+1]-y[i])*(y[i+1]-y[i]));
			sumarea+=tarea(a,b,c);
		}
		System.out.println("the area is "+sumarea);
	}
	public static double tarea(double a,double b,double c) {
		double p =(a+b+c)/2;
		double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return s;
	}

}
