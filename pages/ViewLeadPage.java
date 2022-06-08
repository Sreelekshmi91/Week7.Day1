package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods{
public ViewLeadPage() {
}
public ViewLeadPage verifyLeadID() {
	String leadID = driver.findElement(By.id("viewLead_companyName_sp")).getText().replaceAll("[^0-9]", "");
	System.out.println(leadID);
	return this;

}
public ViewLeadPage verifyDisplaying_records() {
	boolean displayed = driver.findElement(By.className("x-paging-info")).isDisplayed();
	Assert.assertTrue(displayed);
	return this;

}
}