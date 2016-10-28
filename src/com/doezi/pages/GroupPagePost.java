package com.doezi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupPagePost 
{
	WebDriver driver;
	
	By newGroup = By.xpath("//div[@id='my_groups']/div/div[1]/a");
	By newPost = By.id("advanced_activity_body");
	By duzzButton = By.id("compose-submit");
	
	public GroupPagePost(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickNewGroup(){
		driver.findElement(newGroup).click();
	}
	
	public void enterNewPost(){
		driver.findElement(newPost).sendKeys("This is a test post");
	}
	
	public void clickDuzzButton(){
		driver.findElement(duzzButton).click();
	}
	
}
