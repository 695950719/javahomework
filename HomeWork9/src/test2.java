import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输一个2进制数：");
		String bin=input.nextLine();
		try {
			System.out.println(bin2Dex(bin));
		} catch (NumberFormatException ex) {
			System.out.println("发生输入异常");
			
		}

	}
	public static int bin2Dex(String bin) throws NumberFormatException{
		return Integer.parseInt(bin,2);
	}

}
