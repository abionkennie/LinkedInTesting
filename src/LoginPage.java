import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.linkedin.com");
		drive.findElement(By.id("session_key")).sendKeys("abionkennie@gmail.com");
		drive.findElement(By.id("session_password")).sendKeys("P@ssw0rd5@");
		drive.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button")).click();
		String feed=drive.getCurrentUrl();
		if(feed.equals("https://www.linkedin.com/feed/?trk=people-guest_sign-in-submit"))
		{
			System.out.println("Test Case Passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		drive.close();
		

	}

}
