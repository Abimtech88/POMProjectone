package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Note4 extends BaseClass {
public Note4()
{
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[text()='CAREERS']")
private WebElement carrers;

@FindBy(xpath="//a[text()='contact@greenstechnologys.com']")
private WebElement mail;

public WebElement getCarrers() {
	return carrers;
}

public WebElement getMail() {
	return mail;
}
}
