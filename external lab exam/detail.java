package oop;
import java.util.*;
class staf{
	Scanner sc=new Scanner(System.in);
	String name,desig;
	staf(){
		System.out.println("Enter staff name : ");
		name=sc.nextLine();
		System.out.println("Enter  designation : ");
		desig=sc.nextLine();
	}
}
class staffdetail extends staf{
	Scanner sc=new Scanner(System.in);
	String dept;
	int sal;
	staffdetail(){
		System.out.println("Enter staff department : ");
		dept=sc.nextLine();
		System.out.println("Enter staff salary : ");
		sal=sc.nextInt();
	}
}
class staffdisplay extends staffdetail{
	Scanner sc=new Scanner(System.in);
	String award;
	staffdisplay(){
		System.out.println("Enter the Award : ");
		award=sc.nextLine();
	}
	void display() {
		System.out.println("Staff name : "+name);
		System.out.println("Staff designation : "+desig);
		System.out.println("Staff department : "+dept);
		System.out.println("Staff salary : "+sal);
		System.out.println("Staff Award: "+award);
	}
}
public class detail {
public static void main(String[] args) {
	staffdisplay st=new staffdisplay();
	st.display();
}
}