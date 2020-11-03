
public class LinearEquation {
	private int a,b,c,d,e,f;
	public LinearEquation(int a,int b,int c,int d,int e,int f) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		this.f=f;
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
	public int getd() {
		return this.d;
	}
	public int gete() {
		return this.e;
	}
	public int getf() {
		return this.f;
	}
	public boolean isSolvable() {
		if((a*d-b*c)>0)
			return true;
		else
			return false;
		
	}
	public double getX() {
		double res;
		if(isSolvable()) {
			res=(e*d-b*f)/(a*d-b*c);
			return res;
		}
		else return -1;
		
	}
	public double getY() {
		double res;
		if(isSolvable()) {
			res=(a*f-e*c)/(a*d-b*c);
			return res;
		}
		else return -1;
		
	}
}
