import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("输一个16进制数：");
		String hex=input.nextLine();
		try {
			System.out.println(hexToDec(hex.toUpperCase()));
		} catch (NumberFormatException ex) {
			System.out.println("发生输入异常");
			
		}
		
	}
	
	public static int hexToDec(String hex){
		int d=0;
		
		for(int i=0;i<hex.length();i++) {
			char hexchar=hex.charAt(i);
			d=d*16+hexCharToDecimal(hexchar);
		}
		return d;
	}
	public static int hexCharToDecimal(char ch){
		if (ch>='A'&&ch<='F') {
			return 10+ch-'A';
		}
		else if(ch>='0'&&ch<='9'){
			return ch-'0';
		}
		else {
			throw new NumberFormatException();
		}
		
	}
}
