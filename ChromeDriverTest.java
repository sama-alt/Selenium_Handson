import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String projectPath = System.getProperty("user.dir");
   System.out.println(projectPath);
   WebDriver driver = new ChromeDriver();
   driver.get("http://rahulshettyacademy.com/locatorspractice/");
   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
   //driver.findElement(By.id("inputUsername")).sendKeys("rahul");
   //driver.findElement(By.name("inputPassword")).sendKeys("hello123");
   //driver.findElement(By.className("signInBtn")).click();
   //driver.findElement(By.xpath("//input[@placeholder='Name']")).click();**/
   //driver.findElement(By.xpath("//input[@Username = 'inputUsername']")).sendKeys("rahul");;
   driver.findElement(By.xpath("//input[@Password = inputPassword']")).sendKeys("rahul");
 System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	}

}
