package com.test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingTask3 {
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
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-md-5 hotel-suites']/h5"));
		
		for (int i = 0; i < elements.size(); i++) {
			
			System.out.println(elements.get(i).getText());
			
		}
		
		
		
		
		
		
	}

}
