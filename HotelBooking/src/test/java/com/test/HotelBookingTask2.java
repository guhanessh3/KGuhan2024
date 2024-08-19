package com.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HotelBookingTask2 {
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
		WebElement frame = driver.findElement(By.id("hotelsearch_iframe"));
		driver.switchTo().frame(frame);
		WebElement btnsearch = driver.findElement(By.id("searchBtn"));
		btnsearch.click();
		driver.switchTo().parentFrame();
		WebElement selectstate = driver.findElement(By.id("invalid-state"));
		System.out.println(selectstate.getText());
		WebElement invalidcity = driver.findElement(By.id("invalid-city"));
		System.out.println(invalidcity.getText());
		WebElement invalidcheckin = driver.findElement(By.id("invalid-check_in"));
		System.out.println(invalidcheckin.getText());
		WebElement invalidcheckout = driver.findElement(By.id("invalid-check_out"));
		System.out.println(invalidcheckout.getText());
		WebElement invalidrooms = driver.findElement(By.id("invalid-no_rooms"));
		System.out.println(invalidrooms.getText());
		WebElement invalidadults = driver.findElement(By.id("invalid-no_adults"));
	    System.out.println(invalidadults.getText());		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
