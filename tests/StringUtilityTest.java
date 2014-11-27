import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.TestCase;

import org.junit.Test;


public class StringUtilityTest extends TestCase {
	  protected ArrayList<String> bag;
	  protected String sep;
	  
	  // assigning the values
	  protected void setUp(){
		  bag.add("Klk");
		  bag.add("Siii!!!");
		  sep = "manin";
	  }

	  @Test
	  public void testearlier(){
		//True case
		boolean result = t1.get(0) < t2.get(0) ? true : false;
	    assertTrue(result);
	    
	    //False case
	    result = t1.get(1) < t2.get(1) ? true : false;
	    assertTrue(result);    
	  }

	  
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
