package booking;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import room.Room;

public class TestHotel {

	
	private Room roomUnderTest;

	@Before
	  public void setUp() throws Exception {
	    roomUnderTest = new Room();
	    
}
	

	 public void testAvailibility() {
		int date ;
	    String type  = "";
	    boolean empty = false;
		    
		    
		assertEqualsTrue(empty, roomUnderTest.isEmpty());

		type = "single";
		assertEquals(type, roomUnderTest.RoomType());

		date = 0;
		assertEquals(date, roomUnderTest.openDate(0));

		  }


}
