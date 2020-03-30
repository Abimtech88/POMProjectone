package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note2 extends BaseClass {
public  Note2() {
	PageFactory.initElements(driver, this);

}
@FindBy(xpath="//a[text()='Certifications']")
private WebElement certify;

@FindBy(xpath="(//a[text()='Course Content'])[29]")
private WebElement selcontent;

public WebElement getCertify() {
	return certify;
}

public WebElement getSelcontent() {
	return selcontent;
}
@FindBy(xpath="//p[contains(text(),'Greens Technology, Rated As ')]")
private WebElement paragraph;

public WebElement getParagraph() {
	return paragraph;
}
}
