import java.util.*;
public class StopWatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StopWatch a =new StopWatch();
		a.start();
		int[] s=new int[100000];
		for(int i=0;i<100000;++i) {
			s[i]=(int) Math.random();
		}
		for(int i=0;i<s.length;++i) {
			int minindex=i;
			for(int j=i+1;j<s.length;++j) {
				if(s[j]<s[minindex])
					minindex=j;
			}
			if(i!=minindex) {
				int temp=s[i];
				s[i]=s[minindex];
				s[minindex]=temp;
				
			}
		}
		a.stop();
		System.out.println(a.getElapsedTime());
	}

}
