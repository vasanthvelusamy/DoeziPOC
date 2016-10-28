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
public class GroupsPage {
	
	WebDriver driver;
	
	By groupsTab = By.xpath("//div[@id='global_header']/div/div/div[4]/div/ul/li[4]/a");
	By createNewGroupButton = By.xpath("//div[@id='global_content']/div[1]/div[1]/div/div/div[1]/div[2]/div[2]/a");
	By groupName = By.xpath("//input[@id='title']");
	By groupDescription = By.id("description");
	By createButton = By.id("submit");
	
	
	public GroupsPage(WebDriver driver){
		this.driver = driver;
	}
	
	public void clickGroupsTab(){
		driver.findElement(groupsTab).click();
	}
	
	public void clickCreateNewGroupButton(){
		driver.findElement(createNewGroupButton).click();
	}
	
	public void typeGroupName(){
		driver.findElement(groupName).sendKeys("test doezi group newwww");
	}
	
	public void typeGroupDescription(){
		driver.findElement(groupDescription).sendKeys("description for testing doezigroup newwww");
	}
	
	public void clickCreateButton(){
		driver.findElement(createButton).click();
	}
	
	

}
