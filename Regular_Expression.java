import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Regular_Expression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
	
		driver.get("https://rediff.com/");
		
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello new");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("123456");
		
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();

	}

}
