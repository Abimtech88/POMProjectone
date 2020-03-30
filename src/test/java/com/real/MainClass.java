package com.real;

import java.io.IOException;

import com.test.BaseClass;

public class MainClass {
public static void main(String[] args) throws IOException {
	BaseClass b = new BaseClass();
	b.getDriver();
	b.loadUrl("https://www.facebook.com/");
	
	FacebookPom fb = new FacebookPom();
	b.send(fb.geteMail(), "abiraghul6@gmail.com");
	b.send(fb.getPass(), "selenium");
	b.clickBtn(fb.getButton());
	b.screenShot();
	
	
	
	
}
}
