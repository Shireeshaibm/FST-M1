public class Activity2 {


    public static void main(String[] args) {
        
        Integer[] nums ={10,77,10,54,-11,11};

        int temp=0;

           for (int n:nums){
              if(n==10){
             
             temp= temp+n;
              }

           }

           if(temp ==30){
              
            System.out.println("totla value is 30");

           }
           else{
         
           System.out.println("totla value is not  30");
           }

    }



}
