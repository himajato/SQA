package com.sqa.test.selenium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;





public class SeleniumTest {
	public static WebDriver driver = null;
	
	//Trường hợp nhập đúng 2 trường mã sinh viên và mã kì học
	@Test
	public void testValid1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8080/SQA/xemdiem.jsp");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
		masv.sendKeys("B17DCCN462");
		Thread.sleep(2500);
		WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
		kihoc.sendKeys("20182");
		Thread.sleep(2500);
		WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
		bt.click();
		
		String result = driver.getTitle();
		String expected = "Kết quả xem điểm";	
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		assertEquals(expected, result);
		Thread.sleep(5000);
		driver.close();
	}	
	
	//Trường hợp không nhập mã sinh viên
	@Test
	public void testValid2() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("http://localhost:8080/SQA/xemdiem.jsp");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
		masv.sendKeys("");
		Thread.sleep(2500);
		WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
		kihoc.sendKeys("20182");
		Thread.sleep(2500);
		WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
		bt.click();
		
		String result = driver.getTitle();
		String expected = "Sinh viên xem điểm";	
		Thread.sleep(2500);
		assertEquals(expected, result);
		driver.close();
	}	
	//Trường hợp không nhập mã kì học
		@Test
		public void testValid3() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8080/SQA/xemdiem.jsp");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
			masv.sendKeys("B17DCCN462");
			Thread.sleep(2500);
			WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
			kihoc.sendKeys("");
			Thread.sleep(2500);
			WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
			bt.click();
			
			String result = driver.getTitle();
			String expected = "Sinh viên xem điểm";	
			Thread.sleep(2500);
			assertEquals(expected, result);
			driver.close();
		}
	//Trường hợp không nhập cả mã kì học lẫn mã sinh viên
		@Test
		public void testValid4() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8080/SQA/xemdiem.jsp");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
			masv.sendKeys("");
			Thread.sleep(2500);
			WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
			kihoc.sendKeys("");
			Thread.sleep(2500);
			WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
			bt.click();
			
			String result = driver.getTitle();
			String expected = "Sinh viên xem điểm";	
			assertEquals(expected, result);
			driver.close();
		}
		
	//Trường hợp nhập mã sinh viên không tồn tại
		@Test
		public void testValid5() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8080/SQA/xemdiem.jsp");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
			masv.sendKeys("B17DCCN123");
			Thread.sleep(2500);
			WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
			kihoc.sendKeys("20182");
			Thread.sleep(2500);
			WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
			bt.click();
			
			Alert alert = driver.switchTo().alert();
			String result = alert.getText();
			String expected = "Không tìm thấy sinh viên";
			alert.accept();
			Thread.sleep(2500);
			assertEquals(expected, result);
			driver.close();
		}
	//Trường hợp nhập mã sinh viên sai định dạng
		@Test
		public void testValid6() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8080/SQA/xemdiem.jsp");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
			masv.sendKeys("B17DCCN12323");
			Thread.sleep(2500);
			WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
			kihoc.sendKeys("20182");
			Thread.sleep(2500);
			WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
			bt.click();
			
			Alert alert = driver.switchTo().alert();
			String result = alert.getText();
			String expected = "Mã Sinh Viên gồm 10 kí tự VD: B17DCCN462";
			alert.accept();
			Thread.sleep(2500);
			assertEquals(expected, result);
			driver.close();
		}
		//Trường hợp nhập kì học không tồn tại
				@Test
				public void testValid8() throws InterruptedException {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					
					driver.get("http://localhost:8080/SQA/xemdiem.jsp");
					driver.manage().window().maximize();
					
					WebDriverWait wait = new WebDriverWait(driver,10);
					WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
					masv.sendKeys("B17DCCN462");
					Thread.sleep(2500);
					WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
					kihoc.sendKeys("20183");
					Thread.sleep(2500);
					WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
					bt.click();
					
					Thread.sleep(2500);
					Alert alert = driver.switchTo().alert();
					String result = alert.getText();
					String expected = "Không tìm thấy kì học";
					alert.accept();
					Thread.sleep(2500);
					assertEquals(expected, result);
					driver.close();
				}
		//Trường hợp nhập mã sinh viên sai định dạng
		@Test
		public void testValid7() throws InterruptedException {
					System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
					driver = new ChromeDriver();
					driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
					
					driver.get("http://localhost:8080/SQA/xemdiem.jsp");
					driver.manage().window().maximize();
					
					WebDriverWait wait = new WebDriverWait(driver,10);
					WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
					masv.sendKeys("B17DCCN462");
					Thread.sleep(2500);
					WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
					kihoc.sendKeys("201822");
					Thread.sleep(2500);
					WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
					bt.click();
					
					Thread.sleep(2500);
					Alert alert = driver.switchTo().alert();
					String result = alert.getText();
					String expected = "Kì học gồm 5 kí tự VD: 20192";
					alert.accept();
					Thread.sleep(2500);
					assertEquals(expected, result);
					driver.close();
				}
		//Trường hợp nhập sai định dạng cả 2 trường mã sinh viên và mã kì học
		public void testValid9() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\huyng\\Desktop\\DBCLPM\\workspace\\SeleniumSQA\\dirver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.get("http://localhost:8080/SQA/xemdiem.jsp");
			driver.manage().window().maximize();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			WebElement masv = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masv")));
			masv.sendKeys("B17DCCN4622");
			Thread.sleep(2500);
			WebElement kihoc = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kihoc")));
			kihoc.sendKeys("201822");
			Thread.sleep(2500);
			WebElement bt = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("bt")));
			bt.click();
			
			Thread.sleep(2500);
			Alert alert = driver.switchTo().alert();
			String result = alert.getText();
			String expected = "Mã Sinh Viên gồm 10 kí tự VD: B17DCCN462";
			alert.accept();
			Thread.sleep(2500);
			assertEquals(expected, result);
			driver.close();
		}
}
