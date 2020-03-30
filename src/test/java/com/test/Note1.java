package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note1 extends BaseClass {
	public Note1() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h2[text()='Greens Technologys Overall Reviews']")
	private WebElement review;
	
	public WebElement getReview() {
		return review;
	}
	
	@FindBy(xpath="//h1[text()='No 1 Software Training Institutes in Chennai with Placements']")
	private WebElement print;

	public WebElement getPrint() {
		return print;
	}
}
