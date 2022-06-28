import java.util.*; 

public class StackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		
		System.out.println("The pop method returns " + stack.pop());
		System.out.println("The peek method returns " + stack.peek());
		
		
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}

}
