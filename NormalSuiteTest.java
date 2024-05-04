// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class NormalSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void add() {
    driver.get("https://safatelli.github.io/tp-test-logiciel/assets/calc.html");
    driver.manage().window().setSize(new Dimension(1054, 800));
    driver.findElement(By.id("num1")).click();
    driver.findElement(By.id("num1")).sendKeys("2");
    driver.findElement(By.id("operator")).click();
    {
      WebElement dropdown = driver.findElement(By.id("operator"));
      dropdown.findElement(By.xpath("//option[. = '+']")).click();
    }
    driver.findElement(By.id("num2")).click();
    driver.findElement(By.id("num2")).sendKeys("3");
    driver.findElement(By.cssSelector("button")).click();
    assertThat(driver.findElement(By.id("result")).getText(), is("Résultat : 5"));
  }
  @Test
  public void sous() {
    driver.get("https://safatelli.github.io/tp-test-logiciel/assets/calc.html");
    driver.manage().window().setSize(new Dimension(1058, 800));
    driver.findElement(By.id("num1")).click();
    driver.findElement(By.id("num1")).sendKeys("5");
    driver.findElement(By.id("operator")).click();
    {
      WebElement dropdown = driver.findElement(By.id("operator"));
      dropdown.findElement(By.xpath("//option[. = '-']")).click();
    }
    driver.findElement(By.id("num2")).click();
    driver.findElement(By.id("num2")).sendKeys("2");
    driver.findElement(By.cssSelector("button")).click();
    assertThat(driver.findElement(By.id("result")).getText(), is("Résultat : 3"));
  }
  @Test
  public void div() {
    driver.get("https://safatelli.github.io/tp-test-logiciel/assets/calc.html");
    driver.manage().window().setSize(new Dimension(1066, 800));
    driver.findElement(By.id("num1")).click();
    driver.findElement(By.id("num1")).sendKeys("10");
    driver.findElement(By.id("operator")).click();
    {
      WebElement dropdown = driver.findElement(By.id("operator"));
      dropdown.findElement(By.xpath("//option[. = '/']")).click();
    }
    driver.findElement(By.id("num2")).click();
    driver.findElement(By.id("num2")).sendKeys("2");
    driver.findElement(By.cssSelector("button")).click();
    assertThat(driver.findElement(By.id("result")).getText(), is("Résultat : 5"));
  }
  @Test
  public void multi() {
    driver.get("https://safatelli.github.io/tp-test-logiciel/assets/calc.html");
    driver.manage().window().setSize(new Dimension(1070, 800));
    driver.findElement(By.id("num1")).click();
    driver.findElement(By.id("num1")).sendKeys("2");
    driver.findElement(By.id("operator")).click();
    {
      WebElement dropdown = driver.findElement(By.id("operator"));
      dropdown.findElement(By.xpath("//option[. = '*']")).click();
    }
    driver.findElement(By.cssSelector("body")).click();
    driver.findElement(By.id("num2")).click();
    driver.findElement(By.id("num2")).sendKeys("3");
    driver.findElement(By.cssSelector("button")).click();
  }
}
