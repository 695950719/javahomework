import java.util.GregorianCalendar;
public class GregorianCalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar GregorianCalendar_demo=new GregorianCalendar();
		
		System.out.println(GregorianCalendar_demo.get(GregorianCalendar.YEAR)+"年"+GregorianCalendar_demo.get(GregorianCalendar.MONTH)+"月"+GregorianCalendar_demo.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		GregorianCalendar_demo.setTimeInMillis(1234567898765L);
		System.out.println(GregorianCalendar_demo.get(GregorianCalendar.YEAR)+"年"+GregorianCalendar_demo.get(GregorianCalendar.MONTH)+"月"+GregorianCalendar_demo.get(GregorianCalendar.DAY_OF_MONTH)+"日");
		
	}

}
