package pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Robotahandles {

	@Test
	public void demo() throws AWTException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//input[@onchange='uploadimg()']"))).click().build().perform();
		Robot r=new Robot();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
	}

}
