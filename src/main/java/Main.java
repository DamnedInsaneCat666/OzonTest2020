import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://ozon.ru");
        //driver.manage().window().maximize();
    }
}
