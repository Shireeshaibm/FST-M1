import java.util.HashSet;

public class Activity_10 {
	
	public static void main(String[] args) {
		
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("toy1");
		hs.add("toy2");
		hs.add("toy3");
		hs.add("toy4");
		hs.add("toy5");
		hs.add("toy6");
		
		System.out.println("size of the hashset is"+hs.size());
		
		hs.remove("toy4");
		
		hs.remove("toy9");
		
		System.out.println("to check item is present" +hs.contains("toy10"));
		
		for(String toy:hs) {
			
			System.out.println(toy);
		}
		
		
	}

}
