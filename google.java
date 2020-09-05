import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver","//Users//deepakverma//Downloads//chromedriver");
		
		WebDriver driver=new ChromeDriver();
				
	
		driver.get("https://google.com/");
		
		//driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("test");
		
		driver.findElement(By.xpath("//div[@class='gb_5f']/div//div/div[2]/a")).click();
		
		
		
				
		
	}

}
