import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestValid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet122\\Maven Project\\webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
		
	
		//String parentWindow = driver.getWindowHandle();
		
		//for(String subwindow : driver.getWindowHandles()){
		//driver.switchTo().window(subwindow);
		//}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		
	//	WebElement element = wait.until(ExpectedConditions.elementToBeClickable)
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='email required input_authentication']")));
		
		driver.findElement(By.xpath("//input[@class='email required input_authentication']")).sendKeys("alamzishan709@gmail.com");
		driver.findElement(By.xpath("//input[@class='required input_authentication']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		
	}

	private static void Threadsleep() {
		// TODO Auto-generated method stub
		
	}

}
