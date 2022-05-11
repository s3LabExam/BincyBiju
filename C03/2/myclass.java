package oopp;
import java.util.Scanner;
class Employee3 {
	int id,salary;
	String name,address;
	Employee3(int a,String b,String c,int d){
			this.id=a;
			this.name=b;
			this.salary=d;
			this.address=c;
	}
}
class Teacher extends Employee3{
	String dept,sub;
	Teacher(int a,String b,String c,int d,String e,String f){
		super(a,b,c,d);
		this.dept=e;
		this.sub=f;
	}
	void display(){
		System.out.println("\nID"+id);
		System.out.println("Name:"+name);
		System.out.println("Address"+address);
		System.out.println("Salary:"+salary);
		System.out.println("Department"+dept);
		System.out.println("Subject:"+sub);
	}
		
}

public class myclass {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of employees");
		int n=s.nextInt();
		s.nextLine();
		
		Teacher obj[]= new Teacher[n];
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			System.out.println("Enter the ID");
			int u=s.nextInt();
			s.nextLine();
			System.out.println("Enter the name");
			String v=s.nextLine();
			System.out.println("Enter the Address");
			String w=s.nextLine();
			System.out.println("Enter the Salary");
			int x=s.nextInt();
			s.nextLine();
			System.out.println("Enter the Department");
			String y=s.nextLine();
			System.out.println("Enter the Subject");
			String z=s.nextLine();
			obj[i]=new Teacher(u,v,w,x,y,z);
		}
		System.out.println("DETAILS\n");
		for(int i=0;i<n;i++){
			System.out.println("Teacher "+(i+1));
			obj[i].display();
		}
		
	}

}