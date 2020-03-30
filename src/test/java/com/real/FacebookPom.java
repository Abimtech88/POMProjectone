package com.real;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.BaseClass;

public class FacebookPom extends BaseClass {
public FacebookPom()
{
	PageFactory.initElements(driver, this);
}

@FindBy(id="email")
private WebElement eMail;

@FindBy(id="pass")
private WebElement pass;

@FindBy(xpath="//input[@value='Log In']")
private WebElement button;

public WebElement geteMail() {
	return eMail;
}

public WebElement getPass() {
	return pass;
}

public WebElement getButton() {
	return button;
}
}
