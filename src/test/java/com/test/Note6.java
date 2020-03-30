package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note6 extends BaseClass {
	public Note6()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='CONTACT US']")
	private WebElement test;
	
	@FindBy(xpath="//h3[text()='Our Main Branches In Chennai ']")
	private WebElement branchprint;
	
	@FindBy(xpath="//p[text()='Copyright © 2018 Greens Technology. All rights reserved.']")
	private WebElement copyright;

	public WebElement getTest() {
		return test;
	}

	public WebElement getBranchprint() {
		return branchprint;
	}

	public WebElement getCopyright() {
		return copyright;
	}
}
	
