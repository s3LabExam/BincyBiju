package oop;
import java.util.*;
public class threadclass{
	public static void main(String[] args){
		mult obj1=new mult();
		prime obj2=new prime();
		obj1.start();
		obj2.start();
	}
}
class mult extends Thread{
	public synchronized void run() {
		System.out.println("Multiplication table");
		for(int i=1;i<10;i++) {
			System.out.println(i*5);
		}
	}
}
class prime extends Thread{
	int n,m,i;
	Scanner s=new Scanner(System.in);
	public synchronized void run(){
	System.out.println("Enter the number to check prime:");
	n=s.nextInt();
	m=n/2;    
	for(i=2;i<=m;i++)    
	{    
	if(n%i != 0)    
	{    
	System.out.println("Number is prime");      
	}    
	}      
	}
}