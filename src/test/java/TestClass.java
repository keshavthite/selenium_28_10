import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    void test1()
    {
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        Assert.assertEquals(title,"Google");
        driver.quit();
    }
}
