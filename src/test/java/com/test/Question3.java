package com.test;

public class Question3 {
public static void main(String[] args) {
	BaseClass b = new BaseClass();
	b.getDriver();
	b.loadUrl("http://www.greenstechnologys.com/");
	
	Note1 n1= new Note1();
	
	b.scrollDown(n1.getReview());
	b.getText(n1.getReview());
	b.scrollUp(n1.getPrint());
	b.getText(n1.getPrint());
	
	Note2 n2= new Note2();
	
	b.clickBtn(n2.getCertify());
	b.clickBtn(n2.getSelcontent());
	b.getText(n2.getParagraph());
	
	Note3 n3= new Note3();
	
	b.mouseOverAction(n3.getCertify());
	b.mouseOverAction(n3.getTrainingjava());
	b.mouseOverAction(n3.getCorejava());
	b.clickBtn(n3.getCorejava());
	b.scrollDown(n3.getReviews());
	b.getText(n3.getReviews());
	
	Note4 n4= new Note4();
	
	b.clickBtn(n4.getCarrers());
	b.scrollDown(n4.getMail());
	b.getText(n4.getMail());
	
	Note5 n5=new Note5();
	
	b.clickBtn(n5.getTest());
	b.scrollDown(n5.getPhonnum());
	b.getText(n5.getPhonnum());
	//b.scrollDown(n5.getPrint());
	//b.getText(n5.getPrint());
	
	Note6 n6=new Note6();
	
	b.clickBtn(n6.getTest());
	b.scrollDown(n6.getBranchprint());
	b.getText(n6.getBranchprint());
	b.scrollDown(n6.getCopyright());
	b.getText(n6.getCopyright());
}
}
