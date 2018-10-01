import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxClass {

	public static void main(String[] args) 
	{

		  System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-prerequisite\\geckodriver-v0.21.0-win64\\geckodriver.exe");
		  FirefoxDriver driver=new FirefoxDriver();
		  driver.get("http://google.com");
	      System.out.println(driver.getTitle());
		  driver.close();
	      //driver.quit();

	}

}
