package com.bankguru.customer;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.abstractPage.PageFactory;
import com.bankguru.EditCustomerPage;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;

import ObjectPageJson.AbstractObJectJson;
import commons.AbstractTest;

public class EditCustomer extends AbstractTest {

	WebDriver driver;
	String email, loginURL, usernameLogin, passwordLogin, emailUpdate, userID;
	private LoginPage loginPage;
	private RegisterPage registerPage;
	private HomePage homePage;
	private NewCustomerPage newCustomerPage;
	private EditCustomerPage editCustomerPage;
	AbstractObJectJson data;
	String pathData = "/Data/";
	String userPath = System.getProperty("user.dir");
	String pathDataJson = userPath.concat(pathData).concat("BankGuru.json");

	@Parameters({ "browser", "url", "version" })
	@BeforeClass
	public void beforeClass(String browser, String url, String version) {
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
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.inputCustomerName(data.getEditCustomer().getCustomerName());
		newCustomerPage.inputDateOfBirth(data.getEditCustomer().getDateOfBirth());
		newCustomerPage.inputAddress(data.getEditCustomer().getAddress());
		newCustomerPage.inputCity(data.getEditCustomer().getCity());
		newCustomerPage.inputState(data.getEditCustomer().getState());
		newCustomerPage.inputPIN(data.getEditCustomer().getPIN());
		newCustomerPage.inputMobileNumber(data.getEditCustomer().getMobileNumber());
		newCustomerPage.inputEmail(email);
		newCustomerPage.inputPassword(data.getEditCustomer().getPasswordCustomer());
		newCustomerPage.clickSubmit();
		verifyEquals(data.getEditCustomer().getRegisterSuccessfullyMsg(),
				newCustomerPage.getTextMessageCreateCustomerSucces());
		userID = newCustomerPage.getTextUserID();

	}

	@BeforeMethod
	public void beforeMethod() {
		log.info("Edit Customer_01 Step 01 - Open Edit Customer Page");
		editCustomerPage = newCustomerPage.openEditCustomerPage(driver);

	}

	@Test
	public void TC_01_CustomerIdCanotEmpty() {
		log.info("Edit Customer_01 Step 02 - Press Tab CustomerId Field");
		editCustomerPage.pressTabCustomerIdField();
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(data.getEditCustomer().getRequireIdMsg(), editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_02_CustomerIdCannotBeNumberic() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Nummeric CustomerId Field");
		editCustomerPage.enterNummericCustomerIdField(data.getEditCustomer().getNummericValueIdCustomer());
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(data.getEditCustomer().getMustBeNumbericMsg(), editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_03_CustomerIdCannotHaveSpecialCharacter() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Special Character CustomerId Field");
		editCustomerPage.enterSpecialCharacterCustomerIdField(data.getEditCustomer().getSpecialCharacterCustomerId());
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(data.getEditCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextCustomerIdErr());
	}

	@Test
	public void TC_04_ValidCustomerId() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Verify Navigate Edit Customer");
		verifyEquals(data.getEditCustomer().getUrlEditCustomer(), editCustomerPage.getUrlEditCustomer());
	}

	// Testcas 05, 06, 07: Skip

	// @Test
	// public void TC_05_NameCannotEmpty() {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.pressTabNameField();
	// verifyEquals("Customer name must not be blank",
	// editCustomerPage.getTextUsernameErr());
	//
	// }
	//
	// @Parameters({ "nummericValueNameUpdate" })
	// @Test
	// public void TC_06_NameCannotBeNumberic(String nummericValueNameUpdate) {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.enterNummericNameField(nummericValueNameUpdate);
	// verifyEquals("Numbers are not allowed",
	// editCustomerPage.getTextUsernameErr());
	//
	// }
	//
	// @Parameters({ "specialCharacterNameUpdate" })
	// @Test
	// public void TC_07_NameCannotHaveSpecialCharacter(String
	// specialCharacterNameUpdate) {
	// editCustomerPage = newCustomerPage.openEditCustomerPage(driver);
	// editCustomerPage.inputIdCustomer(userID);
	// editCustomerPage.clickSubmitToEditInfor();
	// editCustomerPage.enterSpecialCharacterNameField(specialCharacterNameUpdate);
	// verifyEquals(cannotSpecialCharacterMsg,
	// editCustomerPage.getTextUsernameErr());
	//
	// }

	@Test
	public void TC_08_AddressCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Addres sField");
		editCustomerPage.pressTabAddressField();
		log.info("Edit Customer_01 Step 05 - Verify Text Address Error");
		verifyEquals(data.getEditCustomer().getAddressCannotEmptyMsg(), editCustomerPage.getTextAddressErr());

	}

	@Test
	public void TC_09_CityCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab City Field");
		editCustomerPage.pressTabCityField();
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(data.getEditCustomer().getCityCannotEmptyMsg(), editCustomerPage.getTextCityErr());
	}

	@Test
	public void TC_10_CityCannotBeNumberic() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric City Field");
		editCustomerPage.enterNummericCityField(data.getEditCustomer().getNummericCityField());
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(data.getEditCustomer().getCannotBeNumbericMsg(), editCustomerPage.getTextCityErr());
	}

	@Test
	public void TC_11_CityCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character City Field");
		editCustomerPage.enterSpecialCharacterCityField(data.getEditCustomer().getSpecialCharacterCityUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(data.getEditCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextCityErr());
	}

	@Test
	public void TC_12_StateCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab State Field");
		editCustomerPage.pressTabStateField();
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(data.getEditCustomer().getStateCannotEmptyMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_13_StateCannotBeNumberic() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric State Field");
		editCustomerPage.enterNummericStateField(data.getEditCustomer().getNummericStateField());
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(data.getEditCustomer().getCannotBeNumbericMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_14_StateCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character State Field");
		editCustomerPage.enterSpecialCharacterStateField(data.getEditCustomer().getSpecialCharacterStateUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(data.getEditCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_15_PinMustBeNumeric() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Char Pin Field");
		editCustomerPage.enterCharPinField(data.getEditCustomer().getPinNumberic());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.getEditCustomer().getMustBeNumbericMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_16_PinCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Pin Field");
		editCustomerPage.pressTabPinField();
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.getEditCustomer().getPinCannotEmptyMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_17_PinMustHave6Digits() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Digit");
		editCustomerPage.enterDigit(data.getEditCustomer().getDigitUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.getEditCustomer().getPinMustHave6DigitsMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_18_PinCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Pin Field");
		editCustomerPage.enterSpecialCharacterPinField(data.getEditCustomer().getSpecialCharacterPinUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.getEditCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_19_TelephoneCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Telephone Field");
		editCustomerPage.pressTabTelephoneField();
		log.info("Edit Customer_01 Step 05 - Verify Text Telephone Error");
		verifyEquals(data.getEditCustomer().getTelephoneCannotEmptyMsg(), editCustomerPage.getTextTelephoneErr());
	}

	@Test
	public void TC_20_TelephoneCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Telephone Field");
		editCustomerPage
				.enterSpecialCharacterTelephoneField(data.getEditCustomer().getSpecialCharacterTelephoneUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Telephone Error");
		verifyEquals(data.getEditCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextTelephoneErr());
	}

	@Test
	public void TC_21_EmailCannotEmpty() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Tab Email Field");
		editCustomerPage.pressTabEmailField();
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(data.getEditCustomer().getEmailCannotEmptyMsg(), editCustomerPage.getTextEmailErr());
	}

	@Test
	public void TC_22_EmailIncorrectFormat() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Invalid Email");
		editCustomerPage.enterInvalidEmail(data.getEditCustomer().getInvalidEmail());
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(data.getEditCustomer().getEmailIncorrectFormatMsg(), editCustomerPage.getTextEmailErr());
	}

	@Test
	public void TC_23_EmailCannotHaveBlankSpace() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Press Space Email Field");
		editCustomerPage.pressSpaceEmailField();
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(data.getEditCustomer().getCannotFirstCharacterBlankSpaceMsg(), editCustomerPage.getTextEmailErr());
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
