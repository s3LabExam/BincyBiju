package oopjava;
import java.util.*;
public class employee {
int eno,sal,n;
String ename;
Scanner sc=new Scanner(System.in);
void read()
{
	System.out.println("Enter the employee number:");
	eno=sc.nextInt();
	System.out.println("Enter the employee name:");
	sc.nextLine();
	ename=sc.nextLine();
	System.out.println("Enter the employee salary:");
	sal=sc.nextInt();	
}
void display()
{
	System.out.println("The eno of employee is:"+eno);
	System.out.println("The name of employee is:"+ename);
	System.out.println("The salary of employee is:"+sal);
}
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of employee");
	int n=sc.nextInt();
	employee e[]=new employee[n];
	for(int i=0;i<n;i++)
	{
		e[i]=new employee();
		e[i].read();
	}
	System.out.println("Enter the employee number to be searched");
	int m=sc.nextInt();
	int flag=0;
	for(int i=0;i<n;i++)
	{
      if(e[i].eno==m)
      {
    	 e[i].display();
    	 flag=1;
      }	
 
	}
	 if(flag==0)
	 {
		 System.out.println("Employee not found");
	 }
}
}