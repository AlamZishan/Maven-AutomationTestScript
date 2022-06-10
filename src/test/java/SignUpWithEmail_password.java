import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpWithEmail_password {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet122\\Maven Project\\webdriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://www.urbanladder.com");
				driver.manage().window().maximize();
				System.out.println(driver.getTitle());
				Thread.sleep(1000l);
				driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
				//Thread.sleep(1000l);
				driver.findElement(By.xpath("//a[@class='signup-link authentication_popup']")).click();
				driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest']")).sendKeys("alamzishan709@gmail.com");
				driver.findElement(By.xpath("//input[@class='textfield required input_authentication']")).sendKeys("Urbanlader@1");
				driver.findElement(By.xpath("//input[@class='button primary signup']")).click();
				
				
			}	
}


