import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating user-defined class objects  
		Student s1=new Student(101,"Alice",23);  
		Student s2=new Student(102,"Bob",21);  
		Student s3=new Student(103,"Catherine",25);  
		  //creating arraylist  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(s1);//adding Student class object  
		al.add(s2);  
		al.add(s3);  
		//Getting Iterator  
		Iterator<Student> itr=al.iterator();  
		//traversing elements of ArrayList object  
		while(itr.hasNext()){  
			Student st=(Student)itr.next();  
		    System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());  
		} 

	}

}
