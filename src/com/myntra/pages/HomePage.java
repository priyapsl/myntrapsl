package com.myntra.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.myntra.test.BaseSuit;

public class HomePage {

	
	@FindBy(how=How.XPATH , using=".//*[text()='Men'AND @data-group='men']")
	public static WebElement MenMenu;


	@FindBy(how=How.XPATH, using=".//*[text()='Women' AND @data-group='women' ]")
    public static WebElement womenMenu;
	
	@FindBy(how=How.XPATH, using=".//*[text()='Kids' AND @data-group='kids' ]")
    WebElement kidsMenu;
	
	@FindBy(how=How.XPATH, using=".//*[text()='Home & Living' AND @data-group='home-&-living']")
    WebElement home_living;

   
	public HomePage() {
	
	PageFactory.initElements(BaseSuit.getDriver(), this);
	
	}




}
