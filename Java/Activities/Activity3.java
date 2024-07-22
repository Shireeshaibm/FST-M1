public class Activity3 {

    public static void main(String[] args) {
        
        double seconds =1000000000;
       double  Earthseconds = 31557600 ;
double Mercuryseconds =0.2408467; 
double Venusseconds= 0.61519726;
double Marsseconds= 1.8808158;
double Jupiterseconds= 11.862615; 
double Saturnseconds =29.447498;
double Uranusseconds= 84.016846;
double Neptuneseconds= 164.79132;


System.out.println("age on the mercury "+seconds/Earthseconds/Mercuryseconds);
System.out.println("age on the venus "+seconds/Earthseconds/Venusseconds);
System.out.println("age on the Mars "+seconds/Earthseconds/Marsseconds);
System.out.println("age on the Jupiter"+seconds/Earthseconds+Jupiterseconds);
System.out.println("age on the Saturn "+seconds/Earthseconds/Saturnseconds);
System.out.println("age of the Uranusseconds"+seconds/Earthseconds/Uranusseconds);
System.out.println("age of the Neptune seconds"+seconds/Earthseconds/Neptuneseconds);







    }

}
