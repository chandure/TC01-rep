package ABC_demo11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC01_Login_parameters11 {
	
	WebDriver driver;
	String TestURL=("https://opensource-demo.orangehrmlive.com/");
	String Username="Admin",Password="admin123";
	String Skillname="Java11",Skilldescr="Java11descr";
	
					

	

  @Test(dataProvider="Orange12")
  public void Add_SkillsTest() throws Exception {
	  
	  TC01_Login_parameters11 T1= new TC01_Login_parameters11();
	  
	  T1.OpenChromebrowser();
	  T1.OpenOrangeHRM(TestURL);
	  T1.Login(Username,Password);
	  T1.Add_SkillsTest(Skillname,Skilldescr);
	  T1.CloseBrowser();
  }
  public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}

	
  
   public void OpenChromebrowser() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
		 }
  public void OpenOrangeHRM(String TestURL1) throws Exception {
	  driver.get(TestURL1);

	  
  }
  public void Login(String Username1,String Password1) throws Exception{
  
  
findElement(By.id("txtUsername")).sendKeys(Username1);
findElement(By.id("txtPassword")).sendKeys(Password1);
findElement(By.id("btnLogin")).click();
  }
  
	
	


public void Add_SkillsTest(String Skill_name1,String Skill_descr1) throws Exception {
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Qualifications")).click();
	findElement(By.id("menu_admin_viewSkills")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("skill_name")).sendKeys(Skill_name1);
	findElement(By.id("skill_description")).sendKeys(Skill_descr1);
	findElement(By.id("btnSave")).click();  
	  
  } 


	
public void CloseBrowser() throws Exception {
	driver.quit();
	  
	}

  
  
  }
  
  


  
	  

  

