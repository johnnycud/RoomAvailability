package guest;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
public class TestGuest {
	private String nameTest;
	private String typeTest;
	private String addressTest;
	private long phoneNoTest;
	private float costTest;
	
		
    public TestGuest(String name,String address, String type) {
		 this.nameTest = name;
		 this.typeTest = type;
		 this.addressTest = address;
		 }
    
    public void TestBooking(long phoneNo,float cost) {
		 this.phoneNoTest = phoneNo;
		 this.costTest = cost;
    }
    

    private Guest guest;
    private Guest booking;
	@Before
	public void setUp() throws Exception {
		this.guest = new Guest(this.nameTest,this.addressTest, this.typeTest);
		this.booking = new Guest(this.phoneNoTest,this.costTest);
	    //question = new BooleanQuestion(1, "company car?"); // first argument is question id
	    //criteria = new Criteria();
	}
 
	 @Parameters
	 public static Collection<Object[]> data() {
	   Object[][] dataSet = new Object[][] { { "PFlynn", "Business" }, {"GCummins", "Leisure"}, {"HFoley", "Business"}, {"PByrne", "Business"}, {"COConnell", "Leisure"} };
	   Object[][] bookSet = new Object[][] { { 021784569,305.79 }, {051644542,99.99}, {05855542,211.99}, {05844542,199.99}, {05841125,150.90} };
	   return Arrays.asList(dataSet);
       return Arrays.asList(bookSet);
	   
	 }
 
	 @Test
	 public void constructorShouldSetNameAndType () {
		    assertEquals(this.nameTest, this.guest.getName());
		    assertEquals(this.typeTest, this.guest.getType());
	 }
	 
	   private Profile profile;
	   private BooleanQuestion question;
	   private Criteria criteria;
	   
	   @Before
	   public void create() {
	      
	   }

	   @Test
	   public void matchAnswersFalseWhenMustMatchCriteriaNotMet() {
	      profile.add(new Answer(question, Bool.FALSE)); // employer profile, remember!     
	      criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.MustMatch));

	      boolean matches = profile.matches(criteria); // employer profile matching applicant criteria?
	      
	      assertFalse(matches);
	   }
	   
	   @Test
	   public void matchAnswersTrueForAnyDontCareCriteria() {
	      profile.add(new Answer(question, Bool.FALSE)); // employer profile, remember!          
	      criteria.add(new Criterion(new Answer(question, Bool.TRUE), Weight.DontCare));

	      boolean matches = profile.matches(criteria);  // employer profile matching applicant criteria?
	      
	      assertTrue(matches);

}

