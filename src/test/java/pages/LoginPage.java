package pages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import utility.BrowserDriver;

public class LoginPage extends BrowserDriver {
	
	public static Logger log;

    public static String hamburger_menu_xpath = "//input[@type='checkbox']";
    public static String sign_in_option = "//a[@href='SignIn.html']";

    public static void click_Hamburger_Menu() throws InterruptedException{
    	log= LogManager.getLogger(LoginPage.class);
        driver.manage().window().maximize();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html");
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
        System.out.println("Clicked on Hamburger menu");
        log.info("Opened the website");
    }

    public static void click_signIn_Link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(sign_in_option)).click();
        Thread.sleep(4000);
        System.out.println("Clicked on Sign in");
    }

    public static void click_signIn_Link2() throws InterruptedException {
        driver.close();
        System.out.println("Closed Driver");
    }
}
