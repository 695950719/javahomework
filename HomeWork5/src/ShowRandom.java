import java.util.Random;
public class ShowRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomdemo =new Random(1000);
		for(int i=0;i<50;++i) {
			System.out.println(randomdemo.nextInt(100));
		}
	}

}
