package packTestng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTestNG2Dec19 {
	

  @BeforeSuite
  public void bsuite() {
	  System.out.println("Inside before suite");
  }
  
  @AfterSuite
  public void asuite() {
	  System.out.println("Inside after suite");
  }
	
	
  @Test
  public void test4() {
	  System.out.println("inside the DemoTestNg2");
	//  assertEquals(10, 20);
	  assertEquals("a", "a", "is Equal");
  }
}
