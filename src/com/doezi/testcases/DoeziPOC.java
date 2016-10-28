package com.doezi.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.doezi.pages.EditGroupPage;
import com.doezi.pages.GroupPagePost;
import com.doezi.pages.GroupsPage;
import com.doezi.pages.LoginPage;

import junit.framework.Assert;

public class DoeziPOC {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://doezi.com/");
	}
	
	@Test(priority = 0)
	public void verifyDoeziLogin() throws InterruptedException
	{		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.typeUerName();
		
		loginpage.typePassword();
		
		loginpage.clickLoginButton();		
		
		Thread.sleep(5000);
		
		String homePageURL = driver.getCurrentUrl();
		
		Assert.assertEquals("https://doezi.com/members/home", homePageURL);
		
	}
	
	@Test(priority = 1)
	public void createNewGroup() throws InterruptedException{
		
		GroupsPage groupspage = new GroupsPage(driver);
		
		groupspage.clickGroupsTab();			
		
		String groupsPageURL = driver.getCurrentUrl();
		
		Assert.assertEquals("https://doezi.com/groups", groupsPageURL);		
		
		groupspage.clickCreateNewGroupButton();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		

		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("TB_window")));
				
		driver.switchTo().frame("TB_iframeContent");
		
		groupspage.typeGroupName();
		
		groupspage.typeGroupDescription();
		
		groupspage.clickCreateButton();
		
		Thread.sleep(10000L);
	}
	
	@Test(priority = 2)
	public void editGroupDetails() throws InterruptedException{
		
		EditGroupPage editgrouppage = new EditGroupPage(driver);
		
		Thread.sleep(20000L);
		
		editgrouppage.clickEditGroupLink();
		
		editgrouppage.clickGroupName();
		
		editgrouppage.editGroupName();
		
		editgrouppage.clearGroupDescription();
		
		editgrouppage.editGroupDescription();
		
		editgrouppage.clickFavouriteGroup();
		
		editgrouppage.clickEditButton();
		
		editgrouppage.gotoGroupsPage();
		
	}
	
	@Test(priority = 3)
	public void createNewPost() throws InterruptedException{
		
		GroupPagePost grouppagepost = new GroupPagePost(driver);
		
		Thread.sleep(20000L);
		
		grouppagepost.clickNewGroup();
		
		grouppagepost.enterNewPost();
		
		grouppagepost.clickDuzzButton();
	}
	
	@AfterTest
	public void quitBrowser(){
		driver.quit();
	}
	
	
}
