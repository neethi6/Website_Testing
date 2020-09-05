import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefineLocators2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://facebook.com");  //hit url in the browser
		
		driver.findElement(By.id("email")).sendKeys("nee.raghubanshi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.linkText("Forgotten account?")).click();
	}

}
