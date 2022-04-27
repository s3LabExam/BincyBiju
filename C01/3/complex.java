package OOP;
import java.util.*;
public class complex{
    public static void main(String args[]){
    int real,img,real1,img1,real2,img2;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter real part of1st complex number");
    real=sc.nextInt();
    System.out.println("Enter imaginary part of1st complex number");
    img=sc.nextInt();
    System.out.println("Enter real part of 2nd complex number");
    real1=sc.nextInt();
    System.out.println("Enter imaginary part of 2nd complex number");
    img1=sc.nextInt();
    real2=real + real1;
    img2=img+img1;
    System.out.println("The first complex number is :"+real+"+"+img+"i");
    System.out.println("The second complex number is :"+real1+"+"+img1+"i");
    System.out.println("The sum of two complex number is :"+real2+"+"+img2+"i");
    }   
       
}