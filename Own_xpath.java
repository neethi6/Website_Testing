import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Own_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
		
		driver.get("https://facebook.com");
		
		 
		 //syntax for xpath  //tagname[@attribute='value']
		 
		
		/* driver.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123456");

		driver.findElement(By.xpath("//input[@type='submit']")).click(); */
		
		//syntax for css path  tagname[attribute='value']
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("abc");
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("12345678");
		
		driver.findElement(By.cssSelector("[aria-label='Log In']")).click();
		
		
		
		//syntax for xpath if there are numeric attribute
		
	
		//driver.findElement(By.xpath("//input[contains(@id,'u')]")).click();   
		
		
		//syntax for css path if there are numeric attribute
		
		//driver.findElement(By.cssSelector("input[id*='u']")).click();
		
		
	}

}
