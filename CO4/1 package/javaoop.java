package javaoop;
interface graphic{
	public void rect(int l,int b);
	public void circ(int r);
	public void sq(int a);
	public void tri(int l,int h);
	
}
public class javaoop implements graphic{
	public void rect( int a,int b) {
		 System.out.println("Area of rectangle : "+ a*b);
	}
		 public void tri(int c,int d) {
			 System.out.println("Area of triangle : "+ 0.5*c*d);
	}
		 public void sq(int side) {
			 System.out.println("Area of square : "+ side*side);
	}
		 public void circ(int radius) {
			 System.out.println("Area of circle : "+ 3.14*radius*radius);
	}
}


