package javaoop;

	interface graphics{
		public void add(int a,int b);
		public void sub(int a,int b );
		public void mult(int a,int b);
		public void div(int a,int b);
		
	}
	public class arithmetic implements graphics{
		public void add( int a,int b) {
			 System.out.println("Addition of numbers : "+ (a+b));
		}
			 public void sub(int a,int b) {
				 System.out.println(" subtraction of numbers: " + (a-b) );
		}
			 public void mult(int a,int b) {
				 System.out.println("product of numbers: "+ (a*b));
		}
			 public void div(int a,int b) {
				 System.out.println("division of numbers: "+ ( a/b));
		}
			
	}



