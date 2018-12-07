package com.abstractPage;

import org.openqa.selenium.WebDriver;

import com.bankguru.BalanceEnquiryPage;
import com.bankguru.DeleteAccountPage;
import com.bankguru.DeleteCustomerPage;
import com.bankguru.DepositPage;
import com.bankguru.EditCustomerPage;
import com.bankguru.FundTransferPage;
import com.bankguru.HomePage;
import com.bankguru.LoginPage;
import com.bankguru.NewAccountPage;
import com.bankguru.NewCustomerPage;
import com.bankguru.RegisterPage;
import com.bankguru.WithDrawPage;
import com.ecommerce.AccountTVPage;
import com.ecommerce.Cart;
import com.ecommerce.DetailProduct;
import com.ecommerce.HomeGuru99;
import com.ecommerce.HomeMobile;
import com.ecommerce.TVHome;
import com.joomla.LoginJoomlaPage;
import com.sytner.AboutUsSytner;
import com.sytner.BusinessUsersSytner;
import com.sytner.CarMaintenanceSytner;
import com.sytner.CareerSytner;
import com.sytner.CustomerServiceSytner;
import com.sytner.DealerLocatorSytner;
import com.sytner.FinanceSytner;
import com.sytner.HomeSytner;
import com.sytner.NewCarSytner;
import com.sytner.NewsSytner;
import com.sytner.PromotionsSytner;
import com.sytner.SavedVehicleSytner;
import com.sytner.SellYourCarSytner;
import com.sytner.UsedCarSearchSytner;

public class PageFactory extends AbstractPage {
	private static LoginPage loginPage;
	private static RegisterPage registerPage;
	private static HomePage homePage;
	private static NewCustomerPage newCustomerPage;
	private static EditCustomerPage editCustomerPage;
	private static NewAccountPage newAccountPage;
	private static DepositPage depositPage;
	private static WithDrawPage withDrawPage;
	private static FundTransferPage fundTransferPage;
	private static BalanceEnquiryPage balanceEnquiryPage;
	private static DeleteAccountPage deleteAccountPage;
	private static DeleteCustomerPage deleteCustomerPage;
	private static HomeGuru99 homeGuru99;
	private static LoginJoomlaPage loginJoomlaPage;
	private static HomeSytner homeSytner;
	private static AboutUsSytner aboutUsSytner;
	private static NewsSytner newsSytner;
	private static CustomerServiceSytner customerServiceSytner;
	private static FinanceSytner financeSytner;
	private static SavedVehicleSytner savedVehicleSytner;
	private static UsedCarSearchSytner usedCarSearchSytner;
	private static NewCarSytner newCarSytner;
	private static CarMaintenanceSytner carMaintenanceSytner;
	private static CareerSytner careerSytner;
	private static BusinessUsersSytner businessUsersSytner;
	private static SellYourCarSytner sellYourCarSytner;
	private static DealerLocatorSytner dealerLocatorSytner;
	private static PromotionsSytner promotionsSytner;
	private static HomeMobile momeMobile;
	private static AccountTVPage accountTVPage;
	private static DetailProduct detailProduct;
	private static Cart cart;
	private static TVHome tVHome;

	public static Cart getCartPage(WebDriver driver) {
		return (cart == null) ? new Cart(driver) : cart;
	}

	public static TVHome getTVHomePage(WebDriver driver) {
		return (tVHome == null) ? new TVHome(driver) : tVHome;
	}

	public static DetailProduct getDetailProductPage(WebDriver driver) {
		return (detailProduct == null) ? new DetailProduct(driver) : detailProduct;
	}

	public static AccountTVPage getAccountTVPage(WebDriver driver) {
		return (accountTVPage == null) ? new AccountTVPage(driver) : accountTVPage;
	}

	public static HomeMobile getHomeMobilePage(WebDriver driver) {
		return (momeMobile == null) ? new HomeMobile(driver) : momeMobile;
	}

	public static LoginPage getLoginPage(WebDriver driver) {
		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}

	public static RegisterPage getRegisterPage(WebDriver driver) {
		return (registerPage == null) ? new RegisterPage(driver) : registerPage;
	}

	public static HomePage getHomePage(WebDriver driver) {
		return (homePage == null) ? new HomePage(driver) : homePage;
	}

	public static NewCustomerPage getNewCustomerPage(WebDriver driver) {
		return (newCustomerPage == null) ? new NewCustomerPage(driver) : newCustomerPage;
	}

	public static EditCustomerPage getEditCustomerPage(WebDriver driver) {
		return (editCustomerPage == null) ? new EditCustomerPage(driver) : editCustomerPage;
	}

	public static NewAccountPage getNewAccountPage(WebDriver driver) {
		return (newAccountPage == null) ? new NewAccountPage(driver) : newAccountPage;
	}

	public static DepositPage getDepositPage(WebDriver driver) {
		return (depositPage == null) ? new DepositPage(driver) : depositPage;
	}

	public static WithDrawPage getWithDrawPage(WebDriver driver) {
		return (withDrawPage == null) ? new WithDrawPage(driver) : withDrawPage;
	}

	public static FundTransferPage getFundTransferPage(WebDriver driver) {
		return (fundTransferPage == null) ? new FundTransferPage(driver) : fundTransferPage;
	}

	public static BalanceEnquiryPage getBalanceEnquiryPage(WebDriver driver) {
		return (balanceEnquiryPage == null) ? new BalanceEnquiryPage(driver) : balanceEnquiryPage;
	}

	public static DeleteAccountPage getDeleteAccountPage(WebDriver driver) {
		return (deleteAccountPage == null) ? new DeleteAccountPage(driver) : deleteAccountPage;
	}

	public static DeleteCustomerPage getDeleteCustomerPage(WebDriver driver) {
		return (deleteCustomerPage == null) ? new DeleteCustomerPage(driver) : deleteCustomerPage;
	}

	public static HomeGuru99 getHomeGuru99(WebDriver driver) {
		return (homeGuru99 == null) ? new HomeGuru99(driver) : homeGuru99;
	}

	public static LoginJoomlaPage getLoginJoomlaPage(WebDriver driver) {
		return (loginJoomlaPage == null) ? new LoginJoomlaPage(driver) : loginJoomlaPage;
	}

	public static HomeSytner getHomeSytnerPage(WebDriver driver) {
		return (homeSytner == null) ? new HomeSytner(driver) : homeSytner;
	}

	public static AboutUsSytner getAboutUsSytnerPage(WebDriver driver) {
		return (aboutUsSytner == null) ? new AboutUsSytner(driver) : aboutUsSytner;
	}

	public static NewsSytner getNewsSytnerPage(WebDriver driver) {
		return (newsSytner == null) ? new NewsSytner(driver) : newsSytner;
	}

	public static CustomerServiceSytner getCustomerServiceSytnerPage(WebDriver driver) {
		return (customerServiceSytner == null) ? new CustomerServiceSytner(driver) : customerServiceSytner;
	}

	public static CareerSytner getCareerSytnerPage(WebDriver driver) {
		return (careerSytner == null) ? new CareerSytner(driver) : careerSytner;
	}

	public static FinanceSytner getFinanceSytnerPage(WebDriver driver) {
		return (financeSytner == null) ? new FinanceSytner(driver) : financeSytner;
	}

	public static SavedVehicleSytner getSavedVehicleSytnerPage(WebDriver driver) {
		return (savedVehicleSytner == null) ? new SavedVehicleSytner(driver) : savedVehicleSytner;
	}

	public static UsedCarSearchSytner getUsedCarSearchSytnerPage(WebDriver driver) {
		return (usedCarSearchSytner == null) ? new UsedCarSearchSytner(driver) : usedCarSearchSytner;
	}

	public static NewCarSytner getNewCarSytnerPage(WebDriver driver) {
		return (newCarSytner == null) ? new NewCarSytner(driver) : newCarSytner;
	}

	public static CarMaintenanceSytner getCarMaintenanceSytnerPage(WebDriver driver) {
		return (carMaintenanceSytner == null) ? new CarMaintenanceSytner(driver) : carMaintenanceSytner;
	}

	public static PromotionsSytner getPromotionsSytnerPage(WebDriver driver) {
		return (promotionsSytner == null) ? new PromotionsSytner(driver) : promotionsSytner;
	}

	public static BusinessUsersSytner getBusinessUsersSytnerPage(WebDriver driver) {
		return (businessUsersSytner == null) ? new BusinessUsersSytner(driver) : businessUsersSytner;
	}

	public static SellYourCarSytner getSellYourCarSytnerPage(WebDriver driver) {
		return (sellYourCarSytner == null) ? new SellYourCarSytner(driver) : sellYourCarSytner;
	}

	public static DealerLocatorSytner getDealerLocatorSytnerPage(WebDriver driver) {
		return (dealerLocatorSytner == null) ? new DealerLocatorSytner(driver) : dealerLocatorSytner;
	}
}
