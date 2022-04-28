package oopjava;

import java.util.Scanner;

class overloadd {
	    void area(float x)
	    {
	        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
	    }
	    void area(double x, double y)
	    {
	        System.out.println("the area of the rectangle is "+x*y+" sq units");
	    }
	    void area(double x)
	    {
	        double z = 3.14 * x * x;
	        System.out.println("the area of the circle is "+z+" sq units");
	    }
	}
class overload
	{
	     public static void main(String args[]) 
		{
		   overloadd ob = new overloadd();
		   ob.area(5);
		   ob.area(2.1,3.2);
		   ob.area(3.4);
		
	        }
	}
 
