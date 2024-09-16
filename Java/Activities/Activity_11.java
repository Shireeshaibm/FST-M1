import java.util.HashMap;
import java.util.Map;

public class Activity_11 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> colours = new HashMap<Integer,String>();
		
		colours.put(1, "Red");
		colours.put(2, "Green");
		colours.put(3, "yellow");
		colours.put(4, "pink");
		colours.put(5, "purple");
		
		System.out.println("values of the map"+ colours);
		
		colours.remove(3);
		
		System.out.println("values of the map after removing 1 colour"+ colours);
		
		System.out.println("green color is present "+colours.containsValue("Green"));
		
		System.out.println("size of the map is "+ colours.size());
		
		
	}

}
