package homework2;
import java.util.*;
public class PickACard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = (int) (Math.random() * 13 + 1);
		String s1="",s2="";
		switch(number) {
		case 1:s1="Ace";break;
		case 2:s1="2";break;
		case 3:s1="3";break;
		case 4:s1="4";break;
		case 5:s1="5";break;
		case 6:s1="6";break;
		case 7:s1="7";break;
		case 8:s1="8";break;
		case 9:s1="9";break;
		case 10:s1="10";break;
		case 11:s1="Jack";break;
		case 12:s1="Queen";break;
		case 13:s1="King";break;
		}
		int type = (int) (Math.random() * 4 + 1);
		switch(type) {
		case 1:s2="Clubs";break;
		case 2:s2="Diamonds";break;
		case 3:s2="Hearts";break;
		case 4:s2="Spades";break;
		}
		System.out.println("The card you picked is "+s1+" of "+s2);
	}

}
