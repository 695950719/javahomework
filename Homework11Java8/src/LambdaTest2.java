
public class LambdaTest2 {

	final static String salutation = "Hello! ";
	   
	   public static void main(String args[]){
	      GreetingService greetService1 = message -> 
	      System.out.println(salutation + message);
	      greetService1.sayMessage("Runoob");
	      final int num = 1;
	        Converter<Integer, String> s = (param) -> System.out.println(String.valueOf(param + num));
	        s.convert(2);  // 输出结果为 3
	   }
	    
	   interface GreetingService {
	      void sayMessage(String message);
	   }
	   public interface Converter<T1, T2> {
	        void convert(int i);
	    }
}
