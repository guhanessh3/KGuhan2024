package com.test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingTask5 {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("ksguhanessh@gmail.com");
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("Learn@123");
		WebElement btnlogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		btnlogin.click();
		WebElement dropdownselectstate = driver.findElement(By.id("state"));
		Select s = new Select(dropdownselectstate);
		s.selectByValue("Tamil Nadu");
		WebElement dropdownselectcity = driver.findElement(By.id("city"));
		Select s1 = new Select(dropdownselectcity);
		s1.selectByValue("Coimbatore");
		WebElement selectroomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(selectroomtype);
		s2.selectByVisibleText("Standard");
		s2.selectByVisibleText("Deluxe");
		s2.selectByVisibleText("Suite");
		s2.selectByVisibleText("Luxury");
		s2.selectByVisibleText("Studio");
		WebElement selectdate = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		selectdate.click();
		WebElement checkindate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]"));
		checkindate.click();
		WebElement selectdate2 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		selectdate2.click();
		WebElement checkoutdate = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[3]"));
		checkoutdate.click();
		WebElement rooms = driver.findElement(By.id("no_rooms"));
		Select s3 = new Select(rooms);
		s3.selectByValue("1");
		WebElement noofadults = driver.findElement(By.id("no_adults"));
		Select s4 = new Select(noofadults);
		s4.selectByValue("1");
		WebElement frame = driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(frame);
		WebElement btnsearch = driver.findElement(By.id("searchBtn"));
		btnsearch.click();
		WebElement btncontinue = driver.findElement(By.xpath("(//a[@class='btn filter_btn'])[1]"));
		btncontinue.click();
		driver.switchTo().alert().accept();
		WebElement myself = driver.findElement(By.id("own"));
		myself.click();
		WebElement salutation = driver.findElement(By.id("user_title"));
		Select s5 = new Select(salutation);
		s5.selectByValue("Mr");
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("guhanessh");
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("ks");
		WebElement mobileno = driver.findElement(By.id("user_phone"));
		mobileno.sendKeys("8098181555");
		WebElement email = driver.findElement(By.id("user_email"));
		email.sendKeys("ksguhanessh@gmail.com");
		WebElement gst = driver.findElement(By.id("gst"));
		gst.click();
		WebElement registration = driver.findElement(By.id("gst_registration"));
		registration.sendKeys("9043592058");
		WebElement companyname = driver.findElement(By.id("company_name"));
		companyname.sendKeys("Greens Tech OMR Branch");
		WebElement address = driver.findElement(By.id("company_address"));
		address.sendKeys("Thoraipakkam");
		WebElement btnnext = driver.findElement(By.id("step1next"));
		btnnext.click();
		WebElement btnnext2 = driver.findElement(By.id("step2next"));
		btnnext2.click();
		WebElement cardpayment = driver.findElement(By.xpath("//div[@class='credit-card pm']"));
		cardpayment.click();
		 WebElement btnsubmit = driver.findElement(By.id("submitBtn"));
		 btnsubmit.click();
		 WebElement invalidpayment = driver.findElement(By.id("invalid-payment_type")); 
		 System.out.println(invalidpayment.getText());
		 WebElement invalidcardtype = driver.findElement(By.id("invalid-card_type"));
		 System.out.println(invalidcardtype.getText());
		 WebElement invalidcardno = driver.findElement(By.id("invalid-card_no"));
		 System.out.println(invalidcardno.getText());
		 WebElement invalidcardname = driver.findElement(By.id("invalid-card_name"));
		 System.out.println(invalidcardname.getText());
		 WebElement invalidcardmonth = driver.findElement(By.id("invalid-card_month"));
		 System.out.println(invalidcardmonth.getText());
		 WebElement invalidcvv = driver.findElement(By.id("invalid-cvv"));
		 System.out.println(invalidcvv.getText());
		 
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
