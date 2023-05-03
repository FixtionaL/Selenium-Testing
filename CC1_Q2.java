package Day10.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CC1_Q2 {
public static void main(String[] args) throws InterruptedException
{
	WebDriver driver = new EdgeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(2000);
	    WebElement str1 = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
	    System.out.println(str1.getText());
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
	    WebElement str2 = driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div"));
	    System.out.println(str2.getText());
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
	    WebElement pr1 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	    System.out.println(pr1.getText());
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
	    WebElement pr2 = driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div"));
	    System.out.println(pr2.getText());
	    driver.close();
	}
}