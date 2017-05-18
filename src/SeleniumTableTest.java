import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTableTest {
	
	private WebDriver driver;
	
	@Before
	public void getChromedriver() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/laurazhou/Documents/workspace/SeleniumTableTest/chromedriver");		
		driver = new ChromeDriver();
        driver.get("http://www.w3.org/community/webed/wiki/HTML_tables");
     
	}
	
	
	@Test
	public void testSearch() {
		
		pauseFunc(1000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,850)", "");
        
		WebElement MtStHelens = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[4]/td[1]")));
		WebElement MtStHelensFollowingTr = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[4]/td[1]/following::tr")));
		WebElement MtStHelensFollowingSibling = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[4]/td[1]/following-sibling::td"))); 
		WebElement MtStHelensPreceding = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[4]/td[1]/preceding::tr")));
		WebElement MtStHelensAncestor = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[4]/td[1]/ancestor::table")));
		System.out.println("MtStHelens:			" + MtStHelens.getText());
        System.out.println("MtStHelensFollowingTr:		" + MtStHelensFollowingTr.getText());
        System.out.println("MtStHelensFollowingSibling:	" + MtStHelensFollowingSibling.getText());
        System.out.println("MtStHelensPreceding:		" + MtStHelensPreceding.getText());
        System.out.println("MtStHelensAncestor:		" + MtStHelensAncestor.getText());
		
        System.out.println("\n\n");
        
		WebElement MtLassen = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[2]/td[1]")));
		WebElement MtLassenFollowingTr = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[2]/td[1]/following::tr")));
		WebElement MtLassenFollowingSibling = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[2]/td[1]/following-sibling::td")));
		WebElement MtLassenPreceding = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[2]/td[1]/preceding::tr")));
		WebElement MtLassenAncestor = (new WebDriverWait(driver, 10)).
				until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/table[1]/tbody/tr[2]/td[1]/ancestor::table")));
		System.out.println("MtLassen:			" + MtLassen.getText());
        System.out.println("MtLassenFollowingTr:		" + MtLassenFollowingTr.getText());
        System.out.println("MtLassenFollowingSibling:	" + MtLassenFollowingSibling.getText());
        System.out.println("MtLassenPreceding:		" + MtLassenPreceding.getText());
        System.out.println("MtLassenAncestor:		" + MtLassenAncestor.getText());    
               
        pauseFunc(3000);
    }
	
	
	
//	@After
	public void quitDriver() {
		driver.quit();
	}
	
	
	private void pauseFunc(int millisec) {
		try {
			Thread.sleep(millisec);
		}catch (InterruptedException ex) {
			System.out.println("InterruptedException from Thread.sleep in main");
			ex.printStackTrace();
		}
	}
}
