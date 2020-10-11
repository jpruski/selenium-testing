package exercise;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {


    public static void main(String[] args) {
        System.setProperty(
            "webdriver.gecko.driver",
            "C:\\Program Files\\scelenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://hex4.neocities.org/");
	List<WebElement> elements = driver.findElements(By.className("unclicked"));
	while (elements.size() > 0) {
		elements.get((int) Math.floor(elements.size() * Math.random())).click();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		elements = driver.findElements(By.className("unclicked"));
	}
    }
}
