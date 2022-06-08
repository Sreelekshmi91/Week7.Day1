package com.leaftaps.ui.pages;

import org.openqa.selenium.By;

import com.leaftaps.ui.base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods{
	public MyLeadsPage() {
	}
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage();
	}
	public MyLeadsPage clickFindLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this;
	}
	public EditLeadPage clickPhone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return new EditLeadPage();
	}
	public DuplicateLeadPage click_Phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return new DuplicateLeadPage();
	}
	public DeleteLeadPage click_Phone1() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return new DeleteLeadPage();
	}
	public MergeLeadPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadPage();
	}
}
