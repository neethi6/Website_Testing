import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
	
		driver.get("https://login.salesforce.com/?locale=au");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("abcd");
		
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("12345");
		
		//driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
		
		//driver.quit();
	}

}
