

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Activity_1 {
	
	static ArrayList<String> list;//test fixture
	
	@BeforeEach
		void setup()throws Exception
		{
		list= new ArrayList<String>();
		list.add("shireesha");
		list.add("sreedhar");
		}
	
	@Test

	void insertTest() {
		assertEquals(2,list.size(),"Wrong Size");
		list.add(2,"Mihika");
		assertEquals(3,list.size(),"Wrong Size");
		
		assertEquals("shireesha",list.get(0),"correct");
		System.out.println("Execute");
		assertEquals("sreedhar", list.get(1),"correct");
		assertEquals("Mihika",list.get(2),"not found");
		
	}
	
	@Test
	void replaceTest()
	{
		// Replace new element
        list.set(1, "Parinika");
 
        // Assert size of list
        assertEquals(2, list.size(), "Wrong size");
        // Assert individual elements
        assertEquals("shireesha", list.get(0), "Wrong element");
        assertEquals("Parinika", list.get(1), "Wrong element");
	}

}



