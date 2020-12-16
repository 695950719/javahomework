import java.util.Scanner;

public class test4 {

	public static void main(String[] args)throws NumberFormatException {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("输一个2进制数：");
		String bin=input.nextLine();
		
		try {
			System.out.println(bin2Dex(bin));
		} catch (NumberFormatException ex) {
			
			System.out.println("输入的不是二进制数");
		}
	}
	public static int bin2Dex(String bin) throws NumberFormatException{
		return Integer.parseInt(bin,2);
	}
	

}
class Binformatexception extends Exception{
	public  Binformatexception() {
		super();
	}
}
