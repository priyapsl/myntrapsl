package com.myntra.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.myntra.pages.HomePage;

public class HomeTest {

	@Test
	public void menMenuValidation(){
		
		String val  = HomePage.MenMenu.getText();
		Assert.assertEquals("men menu not found", "Men", val);
	}

   @Test
   public void womenMenu(){
	   
	   String val  = HomePage.womenMenu.getText();
	   Assert.assertEquals("Women menu not found", "Women", val);
   }

}
