package oop;
	import java.util.*;
	class unameException extends Exception{
		unameException(String msg)
		{
			super(msg);
		}
	}
	class passException extends Exception{
		passException(String msg)
		{
			super(msg);
		}
	}
	public class login {
		public static void main (String args[]) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the username");
			String user=sc.nextLine();
			System.out.println("Enter the password");
			String pass=sc.nextLine();
				try{
					if(user.length() <6)
						throw new unameException("username invalid minimum six characters");
					if(!pass.equals("myname")) {
						throw new passException("Invalid password");
					}
					else {
						System.out.println("Logged in");
					}
				}
				catch(unameException e) {
					System.out.println("Exception occured :"+e.getMessage());
				}
				catch(passException e) {
					System.out.println("Exception occured :"+e.getMessage());
				}
			}
			
		}
