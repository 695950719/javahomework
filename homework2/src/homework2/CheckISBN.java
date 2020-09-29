package homework2;
import java.util.*;
public class CheckISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);      
        System.out.println("Enter the first 9 digits of the an ISBN as integer: ");
        String s1=input.nextLine();
   
        int i=0,r=0;
        for(i=0;i<9;++i) {
        	r=(i+1)*(int)s1.charAt(i);
        }
        r=r%11;
        if(r==10)
        	System.out.println("The ISBN-10 number is "+s1+"X");
        else
        	System.out.println("The ISBN-10 number is "+s1+r);
        	
       

}
}