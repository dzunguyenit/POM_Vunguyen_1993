package com.sytner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;

import commons.AbstractTest;

public class CarSearch_006_VehiclesMakeContain extends AbstractTest {

	WebDriver driver;
	private HomeSytner homeSytner;

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {

		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		homeSytner = PageFactory.getHomeSytnerPage(driver);

	}

	@Test
	public void TC_045_CarSearch_006_VehiclesMakeContain() {
		verifyTrue(homeSytner.checkDisplayOKButton(driver));
		verifyTrue(homeSytner.checkDisplayCancelButton(driver));
		verifyTrue(homeSytner.checkValueInMakesDropdown(15, "Hyundai 2"));

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
