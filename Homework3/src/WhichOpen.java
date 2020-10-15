import java.util.*;
public class WhichOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		boolean[] l=new boolean[101];
		for(int i=1;i<101;++i)
			l[i]=false;
		for(int s=1;s<101;++s){
			for(int i=s;i<101;i+=s) {
				if(l[i]==true)l[i]=false;
				else l[i]=true;
			}
		}
		for(int i=1;i<101;++i) {
			if(l[i]==true)
				System.out.println(i);
		}
		
	}

}
