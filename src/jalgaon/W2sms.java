package jalgaon;

import java.io.File;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W2sms
{

	public static void main(String[] args)  throws Exception
	{
		System.out.println("Test Start");
		
		//Get data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Plz Enter Mobile Number:");
		String mobno=sc.nextLine();
		System.out.println("Mobile Number is Valid or Invalid ? ");
		String mobvalid=sc.nextLine();
		System.out.println("Plz Enter Password:");
		String pwd=sc.nextLine();
		System.out.println("Password is Valid or Invalid ?");
		String pwdvalid=sc.nextLine();
		
		//Automate w2sms WebSite
		WebDriver driver=null;
		
		try 
		{
			//Run Browser driver to get Browser
			System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
			
			//Create Object to access that opend Browser
			driver =new FirefoxDriver();
			
			//Launch w2sms site
			driver.get("http://www.way2sms.com/content/index.html");
			
			//Wait until page is ready
			WebDriverWait w=new WebDriverWait(driver,100);
			
			w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
			
			driver.manage().window().maximize();
			
			//Do Login
			driver.findElement(By.name("username")).sendKeys(mobno);
			driver.findElement(By.name("password")).sendKeys(pwd);
			driver.findElement(By.id("loginBTN")).click();
			Thread.sleep(5000);
			//Validation
			if(mobno.length()==0 && ExpectedConditions.alertIsPresent()!=null)
			{
				System.out.println("Test passed for blank Mobile Number");
				driver.switchTo().alert().dismiss();
			}
			else if(mobno.length()<10 && ExpectedConditions.alertIsPresent()!=null)
			{
				System.out.println("Test passed for Invalid wrong size Mobile Number");
				driver.switchTo().alert().dismiss();
			}
			else if(pwd.length()==0 && ExpectedConditions.alertIsPresent()!=null)
			{
				System.out.println("Test passed for Blank Password");
				driver.switchTo().alert().dismiss();
			}
			else if(mobno.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[contains(text(),'registerd at')]")).isDisplayed())
			{
				System.out.println("Test Passed for Invalid Mobile Number");
			}
			else if(mobvalid.equalsIgnoreCase("valid") &&
					pwdvalid.equalsIgnoreCase("invalid") &&
					driver.findElement(By.xpath("//*[(contains(text(),'Forgot Password'))]")).isDisplayed())
			{
				System.out.println("Test passed for invalid Mobile Number");
			}
			else if(mobvalid.equalsIgnoreCase("valid") &&
					mobvalid.equalsIgnoreCase("valid") &&
					driver.findElement(By.xpath("//*[@id='mlocator']")).isDisplayed())
			{
				System.out.println("Test Passed for Valid Data");
			}
			else
			{
				File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest=new File("ScreenShot1.png");
				FileUtils.copyFile(src, dest);
				System.out.println("Test Failed");
			}
			driver.close();
			
			
		}
		catch(Exception e)
		{
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest=new File("Screenshot2.png");
			FileUtils.copyFile(src, dest);
			System.out.println(e.getMessage());
			driver.close();
		}
		System.out.println("Test End");
		
	}

}
