public class Activity_8{

    static void exceptionTest (String str) throws CustomException{
        if(str == null){
            throw new CustomException("String value is null");
        }
        else{
            System.out.println("String value is: "+str);
        }

    }
    
    public static void main(String[] args) {
        try{
            Activity_8.exceptionTest("Hello Java");
            Activity_8.exceptionTest(null);
        }
        catch(CustomException msg){
            System.out.println("Catch block: "+msg.getMessage());
        }
        
    }
}
