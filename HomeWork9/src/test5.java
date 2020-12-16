import java.util.*;
import java.util.concurrent.ExecutionException;
public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list=new ArrayList();
    	try {
			while(true) {
				list.add(new Object());
			}
		} catch (OutOfMemoryError e) {
			System.out.print("出错了");
		}
	}

}
