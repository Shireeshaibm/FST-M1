import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		
		Random indexGen= new Random();
		System.out.println("enter integrs please");
		
		System.out.println("(EOF or non-integer to terminate): ");
		 while(s.hasNextInt()) {
	            al.add(s.nextInt());
	        }
	 
	        Integer nums[] = al.toArray(new Integer[0]);
	        int index = indexGen.nextInt(nums.length);
	        System.out.println("Index value generated: " + index);
	        System.out.println("Value in arary at generated index: " + nums[index]);
	 
	        s.close();
	    }
	
		
		
		
		
	}


