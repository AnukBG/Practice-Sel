
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEClass {

	public static void main(String[] args) 
	
	{
			
		  System.setProperty("webdriver.ie.driver", "C:\\selenium-java-prerequisite\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
		  
		  InternetExplorerDriver driver = new InternetExplorerDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/auth/login");
	      System.out.println(driver.getTitle());
		  //driver.close();
	
		
	}

}
