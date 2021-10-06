package maven1.chromemaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class chromeinvoke11 {

	@Test
	public void chromeinvoke()
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kbnav\\OneDrive\\Documents\\JAVA\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	 
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
	driver.manage().window().maximize();  
	driver.get("http://yahoo.com");  
	// get the current URL of the page  
	String URL= driver.getCurrentUrl();  
	System.out.print(URL);  
	//get the title of the page  
	String title = driver.getTitle();                  
	System.out.println(title);  
	}     
	@BeforeTest  
	public void beforeTest() {    
	System.out.println("before test");  
	}     
	@AfterTest  
	public void afterTest() {  
	 
	System.out.println("after test");  
	}  

	}
	
}
