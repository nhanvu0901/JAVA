import java.util.*; 

public class PriorityQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Alice");  
		queue.add("Bob");  
		queue.add("Catherine ABCDE FEGH");  
		queue.add("David Thompson");  
		
		//Printing the top element of the queue but not removing it
		System.out.println("head:"+queue.peek());  
		
		System.out.println("iterating the queue elements:");  		
//		Iterator<String> itr=queue.iterator();  
//		while(itr.hasNext()){  
//			System.out.println(itr.next());  
//		}  
		
		//Printing the top element and removing it  
		System.out.println("head:"+queue.poll());   
		
		System.out.println("after removing a elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
			System.out.println(itr2.next());  
		}
	}

}
