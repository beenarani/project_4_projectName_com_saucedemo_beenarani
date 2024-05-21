package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String browser = "Chrome";
    static String baseUrl = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        }else {
            System.out.println("Wrong Browser name");
        }

        //4.1 -  Setup Chrome browser.
        WebDriver driver = new ChromeDriver();

        //4.2 - Open URL.
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();

        //4.3 - Print the title of the page.
        System.out.println("Title of the page is : " + driver.getTitle());

        //4.4 - Print the current url.
        System.out.println("Current url is : " + driver.getCurrentUrl());

        //4.5 - Print the page source.
        System.out.println("The source code is : " + driver.getPageSource());

        //4.6 - Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        //4.7 - Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        //4.8 - Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //4.9 - Print the current url.
        System.out.println("Print the current url : " + driver.getCurrentUrl());

        //4.10 - Navigate to baseUrl
        driver.navigate().to(baseUrl);

        //4.11 - Refresh the page.
        driver.navigate().refresh();

        //4.12 - Close the browser.
        driver.quit();

    }
}


