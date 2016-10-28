/**
 * 
 */
package com.doezi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author VASANTH
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	By doeziUserName = By.xpath("//input[@type = 'email']");
	By doeziPassword = By.id("password");
	By doeziLoginButton = By.xpath("//button[@id='submit']");
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void typeUerName(){
		driver.findElement(doeziUserName).sendKeys("doezi.test@gmail.com");
	}
	
	public void typePassword(){
		driver.findElement(doeziPassword).sendKeys("Doezi@123");
	}
	
	public void clickLoginButton(){
		driver.findElement(doeziLoginButton).click();
	}
}
