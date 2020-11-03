
public class QuadraticEquation {
	private int a;
	private int b;
	private int c;
	public QuadraticEquation(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public int geta() {
		return this.a;
	}
	public int getb() {
		return this.b;
	}
	public int getc() {
		return this.c;
	}
	public int getDiscriminant() {
		return b*b-4*a*c;
	}
	public double getRoot1() {
		double res = 0;
		if(getDiscriminant()>0) {
			res=(double)(-b+Math.sqrt(getDiscriminant()))/(double)(2*a);		
		}
		return res;
			
			
	}
	public double getRoot2() {
		double res = 0;
		if(getDiscriminant()>0) {
			res=(double)(-getb()-Math.sqrt(getDiscriminant()))/(double)(2*geta());		
		}
		return res;
			
			
	}
}
