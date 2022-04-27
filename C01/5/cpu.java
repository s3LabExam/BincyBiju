package OOP;
import java.util.*;
public class cpu {
int price;
Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter price of cpu:");
price=sc.nextInt();
}
void disp()
{
System.out.println("price of cpu is:"+price);
}
public class Processor
{
int cores;
String manufacture;
void read()
{
System.out.println("Enter cores of processor:");
cores=sc.nextInt();
sc.nextLine();
System.out.println("Enter manufacture of processor:");
manufacture=sc.nextLine();
}
void disp()
{
System.out.println("Enter cores of processor is:"+cores);
System.out.println("Enter manufacturer of processor is:"+manufacture);

}
}
static class Ram
{
int memory;
   String manufacture;
   Scanner sc=new Scanner(System.in);
void read()
{
System.out.println("Enter size of the ram:");
memory=sc.nextInt();
sc.nextLine();
System.out.println("Enter manufacturer of RAM:");
manufacture=sc.nextLine();
}
void disp()
{
System.out.println("Enter the size of Ram is:"+memory);
System.out.println("Enter manufacturer of RAM is:"+manufacture);

}
}

public static void main(String args[]){
cpu ob=new cpu();
ob.read();
ob.disp();

cpu.Processor ob1= ob.new Processor();
ob1.read();
ob1.disp();

cpu.Ram ob2=new Ram();
ob2.read();
ob2.disp();

}

}
