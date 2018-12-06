package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;

import ObjectPageJson.AbstractObJectJson;
import commons.AbstractTest;

public class NewCustomer extends AbstractTest {

	WebDriver driver;
	String email, loginURL, usernameLogin, passwordLogin, emailUpdate;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private HomePage homePage;
	private NewCustomerPage newCustomerPage;
	AbstractObJectJson data;
	String pathData = "/Data/";
	String userPath = System.getProperty("user.dir");

	@Parameters({ "browser", "url", "version", "dataJson" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version, String dataJson) {
		String pathDataJson = userPath.concat(pathData).concat(dataJson);
		data = getDataJson(pathDataJson);
		log.info("----------OPEN BROWSER-----------");
		driver = openMultiBrowser(browser, url, version);
		loginPage = PageFactory.getLoginPage(driver);
		email = "automation" + randomEmail() + "@gmail.com";
		emailUpdate = "testing" + randomEmail() + "@gmail.com";
		log.info("Pre-condition Step 01 - Get login page URL");
		loginURL = loginPage.getLoginPageUrl();
		log.info("Pre-condition Step 02 - Click Here link");
		registerPage = loginPage.clickHereLink();
		log.info("Pre-condition Step 03 - Input email");
		registerPage.inputEmail(email);
		log.info("Pre-condition Step 04 - Click Submit button");
		registerPage.clickSubmitButton();
		usernameLogin = registerPage.getUserIDInfo();
		passwordLogin = registerPage.getPasswordIDInfo();

		loginPage = registerPage.openLoginPage(loginURL);
		loginPage.inputEmail(usernameLogin);
		loginPage.inputPassword(passwordLogin);
		homePage = loginPage.clickSubmitButton();

	}

	@BeforeMethod
	public void beforeMethod() {
		log.info("New Customer_01 Step 01 - Open New Customer Page");
		newCustomerPage = homePage.openNewCustomerPage(driver);
	}

	@Test
	public void TC_01_NameCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Button Tab Name Field");
		newCustomerPage.pressTabNameField();
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(data.getNewCustomer().getNameCannotEmptyMsg(), newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_02_NameCannotBeNumberic() {
		log.info("New Customer_01 Step 02 - Enter Nummeric Name Field");
		newCustomerPage.enterNummericNameField(data.getNewCustomer().getNummericValueName());
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(data.getNewCustomer().getNamemustBeNumbericMsg(), newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_03_NameCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 02 - Enter Special Character Name Field");
		newCustomerPage.enterSpecialCharacterNameField(data.getNewCustomer().getSpecialCharacterName());
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(data.getNewCustomer().getCannotSpecialCharacterMsg(), newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_04_NameCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space Character Name Field");
		newCustomerPage.pressSpaceNameField();
		log.info("New Customer_01 Step 03 - Verify Text Username Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextUsernameErr());

	}

	@Test
	public void TC_05_AddressCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Button Tab Addres sField");
		newCustomerPage.pressTabAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(data.getNewCustomer().getAddressCannotEmptyMsg(), newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_06_AddressCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space Address Field");
		newCustomerPage.pressSpaceAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_07_CityCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Button Tab City Field");
		newCustomerPage.pressTabCityField();
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(data.getNewCustomer().getCityCannotEmptyMsg(), newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_08_CityCannotBeNumberic() {
		log.info("New Customer_01 Step 02 - Enter Nummeric City Field");
		newCustomerPage.enterNummericCityField(data.getNewCustomer().getNummericValueCity());
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(data.getNewCustomer().getCannotBeNumbericMsg(), newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_09_NameCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 02 - Enter Special Character City Field");
		newCustomerPage.enterSpecialCharacterCityField(data.getNewCustomer().getSpecialCharacterCity());
		log.info("New Customer_01 Step 03 - Verify Text City Error");
		verifyEquals(data.getNewCustomer().getCannotSpecialCharacterMsg(), newCustomerPage.getTextCityErr());

	}

	@Test
	public void TC_10_CityCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space Address Field");
		newCustomerPage.pressSpaceAddressField();
		log.info("New Customer_01 Step 03 - Verify Text Address Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_11_StateCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Tab State Field");
		newCustomerPage.pressTabStateField();
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(data.getNewCustomer().getStateCannotEmptyMsg(), newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_12_StateCannotBeNumberic() {
		log.info("New Customer_01 Step 02 - Enter Nummeric State Field");
		newCustomerPage.enterNummericStateField(data.getNewCustomer().getNummericValueState());
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(data.getNewCustomer().getCannotBeNumbericMsg(), newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_13_StateCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 02 - Enter Special Character State Field");
		newCustomerPage.enterSpecialCharacterStateField(data.getNewCustomer().getSpecialCharacterState());
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(data.getNewCustomer().getCannotSpecialCharacterMsg(), newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_14_StateCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space State Field");
		newCustomerPage.pressSpaceStateField();
		log.info("New Customer_01 Step 03 - Verify Text State Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextStateErr());

	}

	@Test
	public void TC_15_PinMustBeNumeric() {
		log.info("New Customer_01 Step 02 - Enter Char Pin Field");
		newCustomerPage.enterCharPinField(data.getNewCustomer().getCharValueState());
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getMustBeNumbericMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_16_PinCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Tab Pin Field");
		newCustomerPage.pressTabPinField();
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getPinCannotEmptyMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_17_PinMustHave6Digits() {
		log.info("New Customer_01 Step 02 - Enter Digit");
		newCustomerPage.enterDigit(data.getNewCustomer().getDigit());
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getPinMustHave6DigitsMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_18_PinCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 02 - Enter Special Character Pin Field");
		newCustomerPage.enterSpecialCharacterPinField(data.getNewCustomer().getSpecialCharacterPin());
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getCannotSpecialCharacterMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_19_PinCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space Pin Field");
		newCustomerPage.pressSpacePinField();
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_20_PinCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 02 - Enter Blank Space Pin Field");
		newCustomerPage.enterBlankSpacePinField(data.getNewCustomer().getPinBlankSpace());
		log.info("New Customer_01 Step 03 - Verify Text Pin Error");
		verifyEquals(data.getNewCustomer().getMustBeNumbericMsg(), newCustomerPage.getTextPinErr());

	}

	@Test
	public void TC_21_TelephoneCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Tab Telephone Field");
		newCustomerPage.pressTabTelephoneField();
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(data.getNewCustomer().getTelephoneCannotEmptyMsg(), newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_22_TelephoneCannotFirstCharacterBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space TelePhone Field");
		newCustomerPage.pressSpaceTelePhoneField();
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_23_TelephoneCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 02 - Enter Blank Space Telephone Field");
		newCustomerPage.enterBlankSpaceTelephoneField(data.getNewCustomer().getTelephoneBlankSpace());
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(data.getNewCustomer().getMustBeNumbericMsg(), newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_24_TelephoneCannotHaveSpecialCharacter() {
		log.info("New Customer_01 Step 02 - Enter Special Character TelePhone Field");
		newCustomerPage.enterSpecialCharacterTelePhoneField(data.getNewCustomer().getSpecialCharacterTelephone());
		log.info("New Customer_01 Step 03 - Verify Text Telephone Error");
		verifyEquals(data.getNewCustomer().getCannotSpecialCharacterMsg(), newCustomerPage.getTextTelePhoneErr());

	}

	@Test
	public void TC_25_EmailCannotEmpty() {
		log.info("New Customer_01 Step 02 - Press Emaile Field");
		newCustomerPage.pressEmaileField();
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(data.getNewCustomer().getEmailCannotEmptyMsg(), newCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_26_EmailIncorrectFormat() {
		log.info("New Customer_01 Step 02 - Enter Incorrect Email");
		newCustomerPage.enterIncorrectEmail(data.getNewCustomer().getIncorrectEmail());
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(data.getNewCustomer().getEmailIncorrectFormatMsg(), newCustomerPage.getTextEmailErr());

	}

	@Test
	public void TC_27_EmailCannotHaveBlankSpace() {
		log.info("New Customer_01 Step 02 - Press Space Email Field");
		newCustomerPage.pressSpaceEmailField();
		log.info("New Customer_01 Step 03 - Verify Text Email Error");
		verifyEquals(data.getNewCustomer().getFirstCharacterBlankSpaceMsg(), newCustomerPage.getTextEmailErr());

	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
