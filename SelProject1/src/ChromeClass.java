import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeClass {

	public static void main(String[] args) 
	{
	
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium-java-prerequisite\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("http://google.com");
	      System.out.println(driver.getTitle());
		  //driver.close();
	      //driver.quit();
	      
	      System.out.println("Hello world");
		

	}

}
