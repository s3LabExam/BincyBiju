package oopjava;
import java.util.Scanner;
public class manipulation {
	public static void main(String [] args){
		String str1,str2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		str1=s.nextLine();
		System.out.println("Enter another string");
		str2=s.nextLine();
		String str3=str1.concat( str2);
		System.out.println("The new string is "+ str3);
		int str4=str1.compareTo(str2);
		System.out.println("string after comparison is: "+str4);
		String str5=str1.toUpperCase(); 
		System.out.println("The uppercase of the string is:"+str5);
		String str6=str1.toLowerCase(); 
		System.out.println("The Lowercase of the string is:"+str6);
		int str7=str1.length();
		System.out.println("Length of the string is: "+ str7);
		System.out.println("First letter of the string: " + str1.charAt(0));
		System.out.println("Enter the letter to be indexed");
		String b=s.nextLine();
		System.out.println("Index of the letter is"+str1.indexOf(b));
		
		
		
		
		
		
	}

}
