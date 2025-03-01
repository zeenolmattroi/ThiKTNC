import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
    ChromeDriver chromeDriver;

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @Test
    public void testS() {
//        chromeDriver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
//


//        WebElement inputEmail = chromeDriver.findElement(By.xpath("//input[@id='email']"));
//        inputEmail.sendKeys("huhu@gmail.com");
//
//        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
//        inputPass.sendKeys("hoan123");
//
//        WebElement inputUsername = chromeDriver.findElement(By.xpath("//input[@id='login']"));
//        inputUsername.sendKeys("hoan123456");
//
//
//        WebElement btnShow = chromeDriver.findElement(By.xpath("//span[contains(text(),'Continue')]"));
//        btnShow.click();

        chromeDriver.get("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Fsignup%3Fref_cta%3DSign%2Bup%26ref_loc%3Dheader%2Blogged%2Bout%26ref_page%3D%252F%26source%3Dheader-home");
        WebElement inputPass = chromeDriver.findElement(By.xpath("//input[@id='password']"));
        inputPass.sendKeys("@Hoan15012005");

        WebElement inputUsername = chromeDriver.findElement(By.xpath("//input[@id='login_field']"));
        inputUsername.sendKeys("zeenolmattroi");
        WebElement btn = chromeDriver.findElement(By.xpath("//input[@name='commit']"));
        btn.click();

    }


}
