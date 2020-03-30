package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note5 extends BaseClass {
	public Note5()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement test;
	
	@FindBy(xpath="//div[text()=' +91 89399 15577']")
	private WebElement phonnum;
	
	@FindBy(xpath="//p[text()='Thank you very much for your help and further help needed. and my special thanks to Mr. Sandeep.                     ']")
	private WebElement print;

	public WebElement getTest() {
		return test;
	}

	public WebElement getPhonnum() {
		return phonnum;
	}

	public WebElement getPrint() {
		return print;
	}

}
