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
		newCustomerPage = homePage.openNewCustomerPage(driver);
		newCustomerPage.inputCustomerName(data.editCustomer().getCustomerName());
		newCustomerPage.inputDateOfBirth(data.editCustomer().getDateOfBirth());
		newCustomerPage.inputAddress(data.editCustomer().getAddress());
		newCustomerPage.inputCity(data.editCustomer().getCity());
		newCustomerPage.inputState(data.editCustomer().getState());
		newCustomerPage.inputPIN(data.editCustomer().getPIN());
		newCustomerPage.inputMobileNumber(data.editCustomer().getMobileNumber());
		newCustomerPage.inputEmail(email);
		newCustomerPage.inputPassword(data.editCustomer().getPasswordCustomer());
		newCustomerPage.clickSubmit();
		verifyEquals(data.editCustomer().getRegisterSuccessfullyMsg(),
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
		verifyEquals(data.editCustomer().getRequireIdMsg(), editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_02_CustomerIdCannotBeNumberic() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Nummeric CustomerId Field");
		editCustomerPage.enterNummericCustomerIdField(data.editCustomer().getNummericValueIdCustomer());
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(data.editCustomer().getMustBeNumbericMsg(), editCustomerPage.getTextCustomerIdErr());

	}

	@Test
	public void TC_03_CustomerIdCannotHaveSpecialCharacter() {
		editCustomerPage = homePage.openEditCustomerPage(driver);
		log.info("Edit Customer_01 Step 02 - Enter Special Character CustomerId Field");
		editCustomerPage.enterSpecialCharacterCustomerIdField(data.editCustomer().getSpecialCharacterCustomerId());
		log.info("Edit Customer_01 Step 03 - Verify Text Error CustomerID");
		verifyEquals(data.editCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextCustomerIdErr());
	}

	@Test
	public void TC_04_ValidCustomerId() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Verify Navigate Edit Customer");
		verifyEquals(data.editCustomer().getUrlEditCustomer(), editCustomerPage.getUrlEditCustomer());
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
		verifyEquals(data.editCustomer().getAddressCannotEmptyMsg(), editCustomerPage.getTextAddressErr());

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
		verifyEquals(data.editCustomer().getCityCannotEmptyMsg(), editCustomerPage.getTextCityErr());
	}

	@Test
	public void TC_10_CityCannotBeNumberic() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric City Field");
		editCustomerPage.enterNummericCityField(data.editCustomer().getNummericCityField());
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(data.editCustomer().getCannotBeNumbericMsg(), editCustomerPage.getTextCityErr());
	}

	@Test
	public void TC_11_CityCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character City Field");
		editCustomerPage.enterSpecialCharacterCityField(data.editCustomer().getSpecialCharacterCityUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text City Error");
		verifyEquals(data.editCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextCityErr());
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
		verifyEquals(data.editCustomer().getStateCannotEmptyMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_13_StateCannotBeNumberic() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Nummeric State Field");
		editCustomerPage.enterNummericStateField(data.editCustomer().getNummericStateField());
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(data.editCustomer().getCannotBeNumbericMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_14_StateCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character State Field");
		editCustomerPage.enterSpecialCharacterStateField(data.editCustomer().getSpecialCharacterStateUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text State Error");
		verifyEquals(data.editCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextStateErr());
	}

	@Test
	public void TC_15_PinMustBeNumeric() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Char Pin Field");
		editCustomerPage.enterCharPinField(data.editCustomer().getPinNumberic());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.editCustomer().getMustBeNumbericMsg(), editCustomerPage.getTextPinErr());
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
		verifyEquals(data.editCustomer().getPinCannotEmptyMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_17_PinMustHave6Digits() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Digit");
		editCustomerPage.enterDigit(data.editCustomer().getDigitUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.editCustomer().getPinMustHave6DigitsMsg(), editCustomerPage.getTextPinErr());
	}

	@Test
	public void TC_18_PinCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Pin Field");
		editCustomerPage.enterSpecialCharacterPinField(data.editCustomer().getSpecialCharacterPinUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Pin Error");
		verifyEquals(data.editCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextPinErr());
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
		verifyEquals(data.editCustomer().getTelephoneCannotEmptyMsg(), editCustomerPage.getTextTelephoneErr());
	}

	@Test
	public void TC_20_TelephoneCannotHaveSpecialCharacter() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Special Character Telephone Field");
		editCustomerPage
				.enterSpecialCharacterTelephoneField(data.editCustomer().getSpecialCharacterTelephoneUpdate());
		log.info("Edit Customer_01 Step 05 - Verify Text Telephone Error");
		verifyEquals(data.editCustomer().getCannotSpecialCharacterMsg(), editCustomerPage.getTextTelephoneErr());
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
		verifyEquals(data.editCustomer().getEmailCannotEmptyMsg(), editCustomerPage.getTextEmailErr());
	}

	@Test
	public void TC_22_EmailIncorrectFormat() {
		log.info("Edit Customer_01 Step 02 - Input IdCustomer");
		editCustomerPage.inputIdCustomer(userID);
		log.info("Edit Customer_01 Step 03 - Click Submit To EditInfor");
		editCustomerPage.clickSubmitToEditInfor();
		log.info("Edit Customer_01 Step 04 - Enter Invalid Email");
		editCustomerPage.enterInvalidEmail(data.editCustomer().getInvalidEmail());
		log.info("Edit Customer_01 Step 05 - Verify Text Email Error");
		verifyEquals(data.editCustomer().getEmailIncorrectFormatMsg(), editCustomerPage.getTextEmailErr());
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
		verifyEquals(data.editCustomer().getCannotFirstCharacterBlankSpaceMsg(), editCustomerPage.getTextEmailErr());
	}

	@AfterClass
	public void afterClass() {
		closeBrowser();
		log.info("----------CLOSE BROWSER-----------");
	}

}
