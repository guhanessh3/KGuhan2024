package com.test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dummy {
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
		WebElement dropdownselectstate = driver.findElement(By.id("state"));
		Select s = new Select(dropdownselectstate);
		s.selectByValue("Tamil Nadu");
		WebElement dropdownselectcity = driver.findElement(By.id("city"));
		Select s1 = new Select(dropdownselectcity);
		s1.selectByValue("Coimbatore");
		WebElement selectroomtype = driver.findElement(By.id("room_type"));
		Select s2 = new Select(selectroomtype);
		List<WebElement> options = s2.getOptions();
		System.out.println(options.size());
		for (int i = 0; i < options.size(); i++) {
			String option = options.get(i).getText();
			System.out.println(option);
			if (option.equals("Room Type")) {
				continue;	
			}
			s2.selectByVisibleText(option);
		}
		
		
	}
}
