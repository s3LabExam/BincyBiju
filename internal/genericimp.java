package internal;
import java.util.*;
public class genericimp {
	public static void main(String[] args){
		Stack<Integer> obj1=new Stack<Integer>(3);
		System.out.println("Pushing elements into stack");
		obj1.push(100);
		obj1.push(200);
		obj1.push(300);
		System.out.println("After Pushing operation");
		obj1.display();
		obj1.pop();
		System.out.println("After poping");
		obj1.display();

		System.out.println("String type stack");
		Stack<String> obj=new Stack<>(4);
		obj.push("Bincy");
		obj.push("Biju");
		obj.push("Aby");
		obj.push("Annie");
		obj.display();
		System.out.println("Top element= "+obj.topp());	
	}
}

class Stack<T>{
	ArrayList<T> stack;
	int n,top=-1;
	
	Stack(int i){
		this.n=i;
		this.stack=new ArrayList<T>(i);
	}
	
	void push(T data){
		if((top+1)==n){
			System.out.println("Stack overflow");
		}
		else{
			top++;
			if(stack.size()>top){
				stack.set(top,data);
			}
			else{
				stack.add(data);
			}
		}
	}
	
	void display(){
		for(int i=top;i>-1;i--){
			System.out.println(stack.get(i));
		}
	}
	
	void pop(){
		if(top==-1){
			System.out.println("Stack Underflow");
		}
		else{
			top--;
		}
	}
	T topp(){
		return(stack.get(top));
	}
	
}