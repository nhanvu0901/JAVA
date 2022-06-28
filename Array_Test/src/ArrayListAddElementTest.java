import java.util.*;

public class ArrayListAddElementTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();  
        System.out.println("Initial list of elements: "+al);  
        
        //Adding elements to the end of the list  
        al.add("Ravi");  
        al.add("Vijay");  
        al.add("Ajay");  
        System.out.println("After adding elements to the end of the list: "+al);  
        
        //Adding an element at the specific position  
        al.add(1, "Gaurav");  
        System.out.println("After adding an element at a specific position: "+al);  
        
        ArrayList<String> al2=new ArrayList<String>();  
        al2.add("Sonoo");  
        al2.add("Hanumat");  
        //Adding second list elements to the first list  
        al.addAll(al2);  
        System.out.println("After adding second list elements to the first list "+al); 
        
        ArrayList<String> al3=new ArrayList<String>();  
        al3.add("John");  
        al3.add("Rahul");  
        //Adding second list elements to the first list at a specific position  
        al.addAll(1, al3);  
        System.out.println("After adding second list elements to the first list at a specific position "+al);  
	}

}
