import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
	
		driver.get("https://facebook.com");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
		
	
	
	
	}
	

}
