import java.util.Scanner;



public class test3 {

	public static void main(String[] args) throws DexExcetion {
		Scanner input=new Scanner(System.in);
		System.out.println("输一个16进制数：");
		String hex=input.nextLine();
		try {
			System.out.println(hexToDec(hex));
		} catch (DexExcetion ex) {
			System.out.println("发生输入异常");
			
		}

	}
	public static int hexToDec(String hex) throws DexExcetion{
		int d=0;
		
		for(int i=0;i<hex.length();i++) {
			char hexchar=hex.charAt(i);
			int t;
			if (hexchar>='A'&&hexchar<='F') {
				d=d*16+10+hexchar-'A';
			}
			else if(hexchar>='0'&&hexchar<='9'){
				d=d*16+hexchar-'0';
			}
			else {
				throw new DexExcetion();
			}
			
		}
		return d;
	}


}
class DexExcetion extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DexExcetion() {
		super();
	}
	
}