import java.util.ArrayList;
import java.util.Scanner;

public class Activity_9 {
	public static void main(String[] args) {
		

	
	
	ArrayList<String> myList =new ArrayList<String>();
	
	myList.add("kid1");
	myList.add("kid2");
	myList.add("kid3");
	myList.add("kid4");
	myList.add("kid5");
	
	for(String kid:myList) {
		
		System.out.println(kid);
	}
	
	System.out.println("third kid name is "+myList.get(2));
	
	Scanner s= new Scanner(System.in);
	String kid = s.next();
	
	
	System.out.println("checking if the "+kid+" is present");
	
	if(myList.contains(kid)){
		
	System.out.println("kid is present");
	}
	else {
		System.out.println("kid is not present");
	}
	System.out.println("Number of kids in AL is "+myList.size());
	
	myList.remove(3);
	
	System.out.println("1 kid has been removed");
	
	System.out.println("Number of kids in AL is "+myList.size());
	

}
	
}
