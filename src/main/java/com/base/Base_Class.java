package com.base;

import static org.junit.jupiter.api.Assertions.fail;

import java.awt.Desktop;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.JobMediaSheets;

import org.junit.Assert;
import org.junit.jupiter.params.provider.Arguments;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import org.openqa.selenium.io.FileHandler;

public class Base_Class {

	public static WebDriver driver;

	public static JavascriptExecutor js = (JavascriptExecutor) driver;

	protected static ExtentReports extentReports;

	public static File file;


	protected static WebDriver launchBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browserName.equalsIgnoreCase("edge")) {
				driver = new EdgeDriver();
			} else if (browserName.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			}
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING BROWSER LAUNCH");
		}
		driver.manage().window().maximize();
		return driver;
	}

	protected static void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING LAUNCH URL");
		}
	}

	protected static void passInput(WebElement element, String value) {
		try {
			
			element.sendKeys(value);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING PASSINPUT");
		}
	}

	protected static void clickElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {

			Assert.fail("ERROR:OCCURE DURING CLICK ELEMENT");
		}
	}

	protected static void selectOptions(WebElement element, String type, String value) {
		try {
			Select select = new Select(element);

			if (type.equalsIgnoreCase("index")) {
				select.selectByIndex(Integer.parseInt(value));
			} else if (type.equalsIgnoreCase("value")) {
				select.selectByValue(value);

			} else if (type.equalsIgnoreCase("text")) {
				select.selectByVisibleText(value);
			}

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING SELECT OPTIONS");
		}

	}

	protected static void deselectOptions(WebElement element, String type, String value) {

		try {
			Select select = new Select(element);

			if (type.equalsIgnoreCase("text")) {
				select.deselectByVisibleText(value);
			} else if (type.equalsIgnoreCase("value")) {
				select.deselectByValue(value);
			} else if (type.equalsIgnoreCase("index")) {
				select.deselectByIndex(Integer.parseInt(value));
			}

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING DESELECTOPTIONS");
		}
	}
	
	protected static void validation(String actual, String excepected) {
		try {
			Assert.assertEquals(actual, excepected);
		} catch (Exception e) {

			Assert.fail("ERROR : OCCUR DURING VALIDATION");
		}
	}

	protected static void getCurrentUrl() {
		try {
			String currentUrl = driver.getCurrentUrl();
			System.out.println("Current Url" + currentUrl);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING GET CURRENT URL");

		}
	}

	protected void getTitle() {
		try {
			String title = driver.getTitle();
			System.out.println("Title Of The Page" + title);
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING GET TITLE");
		}

	}

	protected static void implicitWait(String type, int number) {
		try {
			if (type.equalsIgnoreCase("sec")) {
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(number));

			}

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING BROWSER LAUNCH");
		}

	}

	protected static void closeBrowser() {
		try {
			driver.close();

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING CLOSE BROWSER");
		}

	}

	protected static void browserTermination() {
		try {
			driver.quit();

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING BROWSER TERMINATION");
		}

	}

	protected static void navigateToNextUrl(String url) {
		try {
			driver.navigate().to(url);

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING NAVIGATE TO NEXT URL");
		}

	}

	protected static void navigationMethods(String navigate) {
		try {
			if (navigate.equalsIgnoreCase("forward")) {
				driver.navigate().forward();
			} else if (navigate.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (navigate.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		}

		catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING NAVIGATION METHODS");
		}
	}

	protected static void alerts(String actions, String text) {
		try {
			Alert alert = driver.switchTo().alert();
			if (actions.equalsIgnoreCase("accept")) {
				alert.accept();
			} else if (actions.equalsIgnoreCase("dismiss")) {
				alert.dismiss();
			} else if (actions.equalsIgnoreCase("sendKeys")) {
				alert.sendKeys(text);
			}

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING ALERTS");

		}
	}

	protected static void screenShot() {
		try {
			Date crntdate = new Date();
			String dateFile = crntdate.toString().replace(" ", "_").replace(":", "_");
			File screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screenShot, new File(".//Screenshot//" + dateFile + ".png"));
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING SCREENSHOT");
		}

	}

	protected static void elementStatus(WebElement element, String type) {
		try {
			if (type.equalsIgnoreCase("enabled")) {
				boolean enabled = element.isEnabled();
				System.out.println(enabled);
			} else if (type.equalsIgnoreCase("displayed")) {
				boolean displayed = element.isDisplayed();
				System.out.println(displayed);
			} else if (type.equalsIgnoreCase("selected")) {
				boolean selected = element.isSelected();
				System.out.println(selected);
			}
		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING ELEMENT STATUS");
		}

	}

	protected static void clearField(WebElement element) {
		try {
			element.clear();

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING CLEARING FIELD");
		}

	}

	protected void switchToFrame(WebElement element, String frameType, int number) {
		try {
			if (frameType.equalsIgnoreCase("index")) {
				driver.switchTo().frame(Integer.parseInt(frameType));
			} else if (frameType.equalsIgnoreCase("name")) {
				driver.switchTo().frame("element");
			} else if (frameType.equalsIgnoreCase("parentframe")) {
				driver.switchTo().parentFrame();
			}

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING SWITCHING FRAME ");
		}

	}

	protected void keyPress(int keycode) {
		try {
			Robot robot = new Robot();

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING KEYBOARD PERFORMANCE ACTIONS");
		}

	}

	protected void windowHandling(int num) {

		try {
			List<String> allwindow = new ArrayList(driver.getWindowHandles());
			driver.switchTo().window(allwindow.get(num));

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING WINDOWS HANDLING");
		}
	}

	protected void javaScriptClick(WebElement element) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value=arguments[1];", element);

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING JAVASCRIPT CLICK");
		}

	}

	protected void javaScriptSendKeys(WebElement element, String value) {

		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value=arguments[1];", element,value);

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING PASSING VALUE");
		}
	}

	protected void scrollDown(int pixels) {

		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0" + pixels + ")", "");

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING SCROLLDOWN");
		}

	}

	protected void scrollUp(int pixels) {

		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0" + pixels + ")", "");

		} catch (Exception e) {
			Assert.fail("ERROR:OCCURE DURING SCROLLDUP");
		}

	}

	public static void extentReportStart(String location) {
		try {
			extentReports = new ExtentReports();
			file = new File(location);
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(file);
			extentReports.attachReporter(sparkReporter);
			extentReports.setSystemInfo("OS", System.getProperty("os.name"));
			extentReports.setSystemInfo("Java Version", System.getProperty("java.version"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void extentReportTearDown(String location) throws IOException {
		try {
			extentReports.flush();
			file = new File(location);
			Desktop.getDesktop().browse((file).toURI());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String takeScreenshot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
		File scrfile = screenshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("Screenshot\\.png" + "_" + timeStamp + ".png");
		FileHandler.copy(scrfile, destfile);
		return destfile.getAbsolutePath();

	}

}
