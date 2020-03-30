package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note3 extends BaseClass{
	public  Note3() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement certify;
	
	@FindBy(xpath="//a[text()='Java Training ']")
	private WebElement trainingjava;
	
	@FindBy(xpath="//a[text()='Core Java Training']")
	private WebElement corejava;
	
	@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
	private WebElement reviews;

	public WebElement getCertify() {
		return certify;
	}

	public WebElement getTrainingjava() {
		return trainingjava;
	}

	public WebElement getCorejava() {
		return corejava;
	}

	public WebElement getReviews() {
		return reviews;
	}
}
