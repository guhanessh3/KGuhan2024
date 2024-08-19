package com.test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingTask7 {
	public static void main(String[] args) throws InterruptedException {
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
		WebElement elementuserloginmsg = driver.findElement(By.xpath("//a[@class='icoTwitter mr-2 dropdown-toggle']"));
		String text = elementuserloginmsg.getText();
		System.out.println(text);
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
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//h2[text()='Sort By']")));
		Thread.sleep(3000);
		List<String> dev= new ArrayList<>();
        WebElement pricehightolow = driver.findElement(By.xpath("//label[@for='value_phtol']"));
        pricehightolow.click();
        Thread.sleep(3000);
		List<String> dev1= new ArrayList<>();
		List<WebElement> elementslist= driver.findElements(By.xpath("//strong[@class='total-prize']"));
		for (int i = 0; i < elementslist.size(); i++) {
			String listweb = elementslist.get(i).getText();
			String replace = listweb.replace("$", "");
			String replace2 = replace.replace(",", "");
			dev.add(replace2);
			dev1.add(replace2);	
		}
		System.out.println(dev1);
		List<String> qa= new ArrayList<>();
		qa.addAll(dev1);
		Collections.sort(qa);
		System.out.println(qa);
		boolean b = qa.equals(dev1);
		if (b) {
			System.out.println("Prices are in high to low order");
		}else {
				System.out.println("Not in high to low price");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

}
