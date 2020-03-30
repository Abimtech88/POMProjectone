package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dell\\eclipse-workspace\\Abi\\Selenium\\PageModel\\driver\\chromedriver79.exe");
	driver = new ChromeDriver();
	return driver;
	}
	public void loadUrl(String url) {
	driver.get(url);
	}
	public void gettitle(String name) {
	driver.getTitle();
	}
	public void getcurrentUrl(String title) {
	driver.getCurrentUrl();
	}
	public static void maxWin() {
		driver.manage().window().maximize();
	}
	public void send(WebElement we,String name) {
		we.sendKeys(name);
	}
	public void clickBtn(WebElement clk) {
		clk.click();
	}
	public void quitBrowser() {
		driver.quit();
	}
	public void close() {
		driver.close();
	}
	public void clear(WebElement e) {
		e.clear();
    }
	public void getText(WebElement e) {
		String text = e.getText();
		System.out.println(text);
	}
	public void getAttribute(WebElement e ) {
		
		String attribute = e.getAttribute("value");
		System.out.println(attribute);
	}
	 public void mouseOverAction(WebElement e) {
			Actions a = new Actions(driver);
			a.moveToElement(e).perform(); 
			}
		    public void dragDrop(WebElement s,WebElement d ) {
			Actions a = new Actions(driver);
			a.dragAndDrop(s, d);
			}
		    public void rightClk(WebElement e) {
		    	Actions a = new Actions(driver);
		    	a.contextClick().perform();
		    }
		    public void doubleClk(WebElement e) {
		       	Actions a = new Actions(driver);
		       	a.doubleClick(e).perform();
		    }
		    public void clkAndhold() {
				Actions a= new Actions(driver);
				a.clickAndHold();
			}
		   public void clk() {
			   Actions a= new Actions(driver);
			   a.click();
			 }
	public void windowClose() {
		driver.close();
	}
	public void fndeleme(WebElement element, String name) {
		element.sendKeys(name);
	}
	public void fndelmnts(WebElement element, String name) {
		element.sendKeys(name);
	}
	public void getpgesrc(String ps) {
		driver.getPageSource();
	}
	public void winhan(String winhn) {
		driver.getWindowHandle();
	}
	public void scrExeSet(WebElement e) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Abinaya')", e);

	}
	public void scrExeGet(WebElement e) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		Object obj=js.executeScript("return arguments[0].getAttribute('value')", e);
		String s=(String)obj;
		System.out.println(s);

	}
	
	public void scrollDown(WebElement e) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	public void scrollUp(WebElement e) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	public void jsclick(WebElement e) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	public void screenShot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File s =ts.getScreenshotAs(OutputType.FILE);
		File d =new File("D:\\Abi New Files\\Course\\Framwork\\Screenshot\\abi.bmp");
		FileUtils.copyFile(s,d);
 	}
}

