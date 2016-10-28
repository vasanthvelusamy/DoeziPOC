package com.doezi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditGroupPage {
	
	WebDriver driver;
	
	By editGroupLink = By.linkText("Edit Group Details");
	By groupName = By.xpath("//input[@id='title']");
	By groupDescription = By.id("description");
	By favouriteGroup = By.id("favourite");
	By submitButton = By.id("submit");
	
	public EditGroupPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickEditGroupLink(){
		driver.findElement(editGroupLink).click();
	}
	
	public void clickGroupName(){
		driver.findElement(groupName).clear();
	}
	
	public void editGroupName(){
		driver.findElement(groupName).sendKeys("test doezi edited");
	}
	
	public void clearGroupDescription(){
		driver.findElement(groupDescription).clear();
	}
	
	public void editGroupDescription(){
		driver.findElement(groupDescription).sendKeys("test doezi group edited");
	}
	
	public void clickFavouriteGroup(){
		driver.findElement(favouriteGroup).click();
	}
	
	public void clickEditButton(){
		driver.findElement(submitButton).click();
	}
	
	public void gotoGroupsPage(){
		driver.navigate().to("https://doezi.com/groups");
	}

}
