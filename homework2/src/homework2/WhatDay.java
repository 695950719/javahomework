package homework2;
import java.util.*;
public class WhatDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("Enter year:(e.g.,2012):");
		int year=input.nextInt();
		System.out.println("Enter month: 1-12:");
		int month=input.nextInt();
		if(month==1|month==2) {
			month=month+12;
			year-=1;
		}
		System.out.println("Enter the day of the month:");
		int day=input.nextInt();
		int j=year/100;
		int k=year%100;
		int h=(day+26*(month+1)/10+k+k/4+j/4+5*j)%7;
		String str="";
		switch(h) {
		case 0:str="saturday";break;
		case 1:str="sunday";break;
		case 2:str="monday";break;
		case 3:str="tuesday";break;
		case 4:str="wednesday";break;
		case 5:str="thursday";break;
		case 6:str="friday";break;
		}
		System.out.println("Enter the day of the month is "+str);

}
}