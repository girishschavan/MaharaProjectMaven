package SmokeTests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Girish\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		
	
	@Test
	public void testAllLinks() throws InterruptedException
	{
		//int flag = 0;
		String mainWindowHandle=driver.getWindowHandle();
		//String nextWindow="nowiwndow";
		System.out.println("main window is "+mainWindowHandle);
		List<WebElement> LinksOnPage = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<LinksOnPage.size();i++)
		{
			//Thread.sleep(2500);

			if(LinksOnPage.get(i).getText().length()>0)
			{
			//	flag =1;
			System.out.println("Page Link number "+i+" is: "+LinksOnPage.get(i).getText());
		    //mainWindowHandle = driver.getWindowHandle();
			//LinksOnPage.get(i).click();
			//for(String windowhandle:driver.getWindowHandles())
			//{
			//   driver.switchTo().window(windowhandle);
			//   System.out.println("new window is "+windowhandle);
			//   nextWindow=windowhandle;
			//}
			
			
		/*	if (mainWindowHandle.equals(nextWindow))
			{
				driver.getTitle();
				System.out.println("new title is "+driver.getTitle());
				System.out.println("new url is "+driver.getCurrentUrl());
			}
			else
			{
				System.out.println("different window handle is "+nextWindow);
				System.out.println("else new title is "+driver.getTitle());
				System.out.println("else new url is "+driver.getCurrentUrl());
				
			}
			driver.get("http://www.seleniumframework.com/Practiceform/");
			/*
			String newURL1 = driver.getCurrentUrl();
			
			System.out.println("new url is "+newURL1);
		
			
			HttpURLConnection connection = (HttpURLConnection)newURL.openConnection();
			 
			try
	 
			{
	 
			    connection.connect();
	 
			     response = connection.getResponseMessage();	        
	 
			    connection.disconnect();
	 
			    return response;
	 
			}
			
			
			}
			
			try{
				if (flag==1)
				{
			driver.navigate().to("http://www.seleniumframework.com/Practiceform/");
			driver.switchTo().window(mainWindowHandle);
			System.out.println("in try main");
			System.out.println("navigated to main window");
			flag=0;
				}
				System.out.println("in try out if");
			}
			catch(Exception e)
			{
			e.printStackTrace();	
			}*/
		}
		
		
	
	}
	

}
}
