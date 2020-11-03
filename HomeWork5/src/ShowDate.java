import java.util.Date;
public class ShowDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date_s=new Date();
		long i=10000;
		while(i<=1000000000) {
			date_s.setTime(i);
			System.out.println(date_s.toString());
			i*=10;
			
		}
	}

}
