package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods{
public CreateLeadPage() {
}
public CreateLeadPage typeCompanyName(String CompanyName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
	return this;

}
public CreateLeadPage typeFirstName(String FirstName) {
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
	return this;

}
public CreateLeadPage typeLastName(String LastName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
	return this;

}
public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage();

}




}