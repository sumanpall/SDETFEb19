package packTestng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class DemoTestngDec19 {
	
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\suman.palle\\Downloads\\SeleniumBroDrivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  System.out.println("Inside bTest");
  }
  
  @Test(priority=1)
  public void OpenApp() {
	  
	  driver.get("http://newtours.demoaut.com/");
	  System.out.println(driver.getTitle());
	    // id, name , css, classname, tagname,xpath
	 List<WebElement> link_coll=driver.findElements(By .tagName("a"));
	 System.out.println(link_coll.size());
	 for(int i=0;i<=link_coll.size()-1;i++) {
		 String lnk_name=link_coll.get(i).getText();
		 System.out.println(lnk_name);
		 if(lnk_name.equalsIgnoreCase("REGISTER")) {
			 link_coll.get(i).click();
			 break;
		 }
	 }
	 
	  
	  driver.findElement(By .name("country")).sendKeys("ISRAEL");
	  Select sel=new Select(driver.findElement(By .name("country")));
	    sel.selectByValue("251");
	    sel.selectByVisibleText("TOGO");
	    sel.selectByIndex(45);
	  
	  
	  String str=driver.findElement(By .name("country")).getText();
	  System.out.println(str);
	  driver.findElement(By .name("email")).sendKeys("Kevin");
	  driver.findElement(By .name("password")).sendKeys("Kevin");
	  String str1=driver.findElement(By .xpath("//table/tbody/tr[5]/td/div")).getText();
	  System.out.println(str1);
	  //maximize the browser window
	  driver.manage().window().maximize();
	  System.out.println("Inside OpenApp testcase");
	  //driver.quit();
	  //body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > div
	  //body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > div
  }
  @Test(priority=2,enabled=false)
  public void Login() {
	  driver.get("https://www.google.co.in/");
	  System.out.println(driver.getTitle());
	  driver.findElement(By .linkText("Gmail")).click();
	  System.out.println(driver.getTitle());
	  driver.findElement(By .linkText("Terms")).click();
	  System.out.println(driver.getTitle());
	   Set<String> wndHand=driver.getWindowHandles();
	   System.out.println(wndHand.size());
	   Iterator<String> ita=wndHand.iterator();
	   String w1=ita.next().toString();
	   String w2=ita.next().toString();
	   //Switching between browser windows
	   driver.switchTo().window(w2);
	   
	   System.out.println(driver.getTitle());
	  driver.findElement(By .linkText("view archived versions")).click();
	  System.out.println(driver.getTitle());
	  System.out.println("Inside Login testcase");
  }
  @Test(priority=3,enabled=false)
  public void Logout() {
	  
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.findElement(By .xpath("/html/body/div[4]/div[1]/div[1]/div[3]/form/input[2]")).click();
	  Alert a=driver.switchTo().alert();
	  a.accept();
	  driver.findElement(By .id("small-searchterms")).sendKeys("Com");
	  System.out.println("Inside Logout testcase");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside bclass");
  }
  
  @AfterClass
  public void afterclass() {
	  System.out.println("Inside aclass");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside bmethod");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside amethod");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside aTest");
  }
}
