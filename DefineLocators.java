import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefineLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
	
		driver.get("https://login.salesforce.com/?locale=au");
	driver.findElement(By.id("username")).sendKeys("hello");
	driver.findElement(By.name("pw")).sendKeys("123456");
	
	/* driver.findElement(By.className("input r4 wide mb16 mt8 password")).click(); throw an error due to 
	spaces in class name */
	
	driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
	
	//driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")).click();
	
	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	
	
	}
	

}
