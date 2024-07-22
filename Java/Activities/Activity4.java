import java.util.Arrays;


public class Activity4 {

public static void main(String[] args) {
    

  Integer[] nums={4,3,2,10,12,1,5,6};

  System.out.println(Arrays.toString(nums));

  //sort login 
  
  for(int i=1;i<nums.length;i++){
	  
	  int key =nums[i];
	  int j=i-1;
	  
	  while(j>=0 && nums[j]>key ) {
		  
		  nums[j+1] =nums[j];
		  j=j-1;
		   }
	 nums[j+1]=key;
	  
	 
     }



  
	  
	  System.out.print(Arrays.toString(nums));
  
   

  

}}

  






