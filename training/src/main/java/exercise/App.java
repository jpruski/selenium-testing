package exercise;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class App {


    public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	System.setProperty(
            "webdriver.gecko.driver",
            "C:\\Program Files\\scelenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
        // launch Fire fox and direct it to the Base URL
        driver.get("https://hex4.neocities.org/");
	// to do
	// 3 classes: unclicked, marked, markedNew
        Method[] methods = driver.class.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
                System.out.println(methods[i].toString());
        }
        //close Fire fox
        driver.close();
       
    }
}