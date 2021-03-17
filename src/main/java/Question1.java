import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.setProperty("webdriver.chrome.driver","/home/ttn/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        System.out.println("Salary of "+str);
        System.out.println(driver.findElement(By.xpath("//div[@class=\"et_pb_module et_pb_text et_pb_text_4  et_pb_text_align_left et_pb_bg_layout_light\"]//table//td[contains(text(),'"+str+"')]/following-sibling::td[2]")).getText());
    }
}