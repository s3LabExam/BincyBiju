package internal;
import java.io.*;
import java.util.Scanner;
public class Threadclass {
   public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the start of number range");
		int st=s.nextInt();
		s.nextLine();
		System.out.println("enter the end of number range");
		int l=s.nextInt();
		numbers ob1=new numbers(st,l);
		square ob2=new square(st,l);
		cube ob3=new cube(st,l);
		Thread th1=new Thread(ob1);
		Thread th2=new Thread(ob2);
		Thread th3=new Thread(ob3);
		th1.start();
		th2.start();
		th3.start();
	}
}

class numbers implements Runnable{
	int m,n;
	
	public numbers(int i,int j){
		m=i;
		n=j;		
	}
	
	public synchronized void run(){
		System.out.println(" Numbers are ");
		for(int i=m;i<=n;i++){
				System.out.println(i);
		}
	}
}
	
class square implements Runnable{
	int m,n;
	Scanner s=new Scanner(System.in);
	public square(int i,int j){
		m=i;
		n=j;
	}
	
	public synchronized void run(){
		for(int i=m;i<=n;i++){
			if(i%2==0){
		System.out.println("Square of the number is "+(i*i));
		}
		}
	}
}

class cube implements Runnable{
	int m,n;
	Scanner s=new Scanner(System.in);
	public cube(int i,int j){
		m=i;
		n=j;
	}
	
	public synchronized void run(){
		for(int i=m;i<=n;i++){
			if(i%2!=0){
		System.out.println("cube of the number is "+(i*i*i));
		}
		}
	}
}
