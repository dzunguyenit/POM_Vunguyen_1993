package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EditCustomer {

	@SerializedName("customerName")
	@Expose
	private String customerName;
	@SerializedName("dateOfBirth")
	@Expose
	private String dateOfBirth;
	@SerializedName("address")
	@Expose
	private String address;
	@SerializedName("city")
	@Expose
	private String city;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("PIN")
	@Expose
	private String pIN;
	@SerializedName("mobileNumber")
	@Expose
	private String mobileNumber;
	@SerializedName("passwordCustomer")
	@Expose
	private String passwordCustomer;
	@SerializedName("registerSuccessfullyMsg")
	@Expose
	private String registerSuccessfullyMsg;
	@SerializedName("requireIdMsg")
	@Expose
	private String requireIdMsg;
	@SerializedName("nummericValueIdCustomer")
	@Expose
	private String nummericValueIdCustomer;
	@SerializedName("specialCharacterCustomerId")
	@Expose
	private String specialCharacterCustomerId;
	@SerializedName("nummericCityField")
	@Expose
	private String nummericCityField;
	@SerializedName("specialCharacterCityUpdate")
	@Expose
	private String specialCharacterCityUpdate;
	@SerializedName("nummericStateField")
	@Expose
	private String nummericStateField;
	@SerializedName("specialCharacterStateUpdate")
	@Expose
	private String specialCharacterStateUpdate;
	@SerializedName("pinNumberic")
	@Expose
	private String pinNumberic;
	@SerializedName("digitUpdate")
	@Expose
	private String digitUpdate;
	@SerializedName("specialCharacterPinUpdate")
	@Expose
	private String specialCharacterPinUpdate;
	@SerializedName("specialCharacterTelephoneUpdate")
	@Expose
	private String specialCharacterTelephoneUpdate;
	@SerializedName("invalidEmail")
	@Expose
	private String invalidEmail;
	@SerializedName("cannotBeNumbericMsg")
	@Expose
	private String cannotBeNumbericMsg;
	@SerializedName("cannotSpecialCharacterMsg")
	@Expose
	private String cannotSpecialCharacterMsg;
	@SerializedName("urlEditCustomer")
	@Expose
	private String urlEditCustomer;
	@SerializedName("cannotFirstCharacterBlankSpaceMsg")
	@Expose
	private String cannotFirstCharacterBlankSpaceMsg;
	@SerializedName("mustBeNumbericMsg")
	@Expose
	private String mustBeNumbericMsg;
	@SerializedName("cityCannotEmptyMsg")
	@Expose
	private String cityCannotEmptyMsg;
	@SerializedName("addressCannotEmptyMsg")
	@Expose
	private String addressCannotEmptyMsg;
	@SerializedName("stateCannotEmptyMsg")
	@Expose
	private String stateCannotEmptyMsg;
	@SerializedName("pinCannotEmptyMsg")
	@Expose
	private String pinCannotEmptyMsg;
	@SerializedName("pinMustHave6DigitsMsg")
	@Expose
	private String pinMustHave6DigitsMsg;
	@SerializedName("telephoneCannotEmptyMsg")
	@Expose
	private String telephoneCannotEmptyMsg;
	@SerializedName("emailCannotEmptyMsg")
	@Expose
	private String emailCannotEmptyMsg;
	@SerializedName("emailIncorrectFormatMsg")
	@Expose
	private String emailIncorrectFormatMsg;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPIN() {
		return pIN;
	}

	public void setPIN(String pIN) {
		this.pIN = pIN;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPasswordCustomer() {
		return passwordCustomer;
	}

	public void setPasswordCustomer(String passwordCustomer) {
		this.passwordCustomer = passwordCustomer;
	}

	public String getRegisterSuccessfullyMsg() {
		return registerSuccessfullyMsg;
	}

	public void setRegisterSuccessfullyMsg(String registerSuccessfullyMsg) {
		this.registerSuccessfullyMsg = registerSuccessfullyMsg;
	}

	public String getRequireIdMsg() {
		return requireIdMsg;
	}

	public void setRequireIdMsg(String requireIdMsg) {
		this.requireIdMsg = requireIdMsg;
	}

	public String getNummericValueIdCustomer() {
		return nummericValueIdCustomer;
	}

	public void setNummericValueIdCustomer(String nummericValueIdCustomer) {
		this.nummericValueIdCustomer = nummericValueIdCustomer;
	}

	public String getSpecialCharacterCustomerId() {
		return specialCharacterCustomerId;
	}

	public void setSpecialCharacterCustomerId(String specialCharacterCustomerId) {
		this.specialCharacterCustomerId = specialCharacterCustomerId;
	}

	public String getNummericCityField() {
		return nummericCityField;
	}

	public void setNummericCityField(String nummericCityField) {
		this.nummericCityField = nummericCityField;
	}

	public String getSpecialCharacterCityUpdate() {
		return specialCharacterCityUpdate;
	}

	public void setSpecialCharacterCityUpdate(String specialCharacterCityUpdate) {
		this.specialCharacterCityUpdate = specialCharacterCityUpdate;
	}

	public String getNummericStateField() {
		return nummericStateField;
	}

	public void setNummericStateField(String nummericStateField) {
		this.nummericStateField = nummericStateField;
	}

	public String getSpecialCharacterStateUpdate() {
		return specialCharacterStateUpdate;
	}

	public void setSpecialCharacterStateUpdate(String specialCharacterStateUpdate) {
		this.specialCharacterStateUpdate = specialCharacterStateUpdate;
	}

	public String getPinNumberic() {
		return pinNumberic;
	}

	public void setPinNumberic(String pinNumberic) {
		this.pinNumberic = pinNumberic;
	}

	public String getDigitUpdate() {
		return digitUpdate;
	}

	public void setDigitUpdate(String digitUpdate) {
		this.digitUpdate = digitUpdate;
	}

	public String getSpecialCharacterPinUpdate() {
		return specialCharacterPinUpdate;
	}

	public void setSpecialCharacterPinUpdate(String specialCharacterPinUpdate) {
		this.specialCharacterPinUpdate = specialCharacterPinUpdate;
	}

	public String getSpecialCharacterTelephoneUpdate() {
		return specialCharacterTelephoneUpdate;
	}

	public void setSpecialCharacterTelephoneUpdate(String specialCharacterTelephoneUpdate) {
		this.specialCharacterTelephoneUpdate = specialCharacterTelephoneUpdate;
	}

	public String getInvalidEmail() {
		return invalidEmail;
	}

	public void setInvalidEmail(String invalidEmail) {
		this.invalidEmail = invalidEmail;
	}

	public String getCannotBeNumbericMsg() {
		return cannotBeNumbericMsg;
	}

	public void setCannotBeNumbericMsg(String cannotBeNumbericMsg) {
		this.cannotBeNumbericMsg = cannotBeNumbericMsg;
	}

	public String getCannotSpecialCharacterMsg() {
		return cannotSpecialCharacterMsg;
	}

	public void setCannotSpecialCharacterMsg(String cannotSpecialCharacterMsg) {
		this.cannotSpecialCharacterMsg = cannotSpecialCharacterMsg;
	}

	public String getUrlEditCustomer() {
		return urlEditCustomer;
	}

	public void setUrlEditCustomer(String urlEditCustomer) {
		this.urlEditCustomer = urlEditCustomer;
	}

	public String getCannotFirstCharacterBlankSpaceMsg() {
		return cannotFirstCharacterBlankSpaceMsg;
	}

	public void setCannotFirstCharacterBlankSpaceMsg(String cannotFirstCharacterBlankSpaceMsg) {
		this.cannotFirstCharacterBlankSpaceMsg = cannotFirstCharacterBlankSpaceMsg;
	}

	public String getMustBeNumbericMsg() {
		return mustBeNumbericMsg;
	}

	public void setMustBeNumbericMsg(String mustBeNumbericMsg) {
		this.mustBeNumbericMsg = mustBeNumbericMsg;
	}

	public String getCityCannotEmptyMsg() {
		return cityCannotEmptyMsg;
	}

	public void setCityCannotEmptyMsg(String cityCannotEmptyMsg) {
		this.cityCannotEmptyMsg = cityCannotEmptyMsg;
	}

	public String getAddressCannotEmptyMsg() {
		return addressCannotEmptyMsg;
	}

	public void setAddressCannotEmptyMsg(String addressCannotEmptyMsg) {
		this.addressCannotEmptyMsg = addressCannotEmptyMsg;
	}

	public String getStateCannotEmptyMsg() {
		return stateCannotEmptyMsg;
	}

	public void setStateCannotEmptyMsg(String stateCannotEmptyMsg) {
		this.stateCannotEmptyMsg = stateCannotEmptyMsg;
	}

	public String getPinCannotEmptyMsg() {
		return pinCannotEmptyMsg;
	}

	public void setPinCannotEmptyMsg(String pinCannotEmptyMsg) {
		this.pinCannotEmptyMsg = pinCannotEmptyMsg;
	}

	public String getPinMustHave6DigitsMsg() {
		return pinMustHave6DigitsMsg;
	}

	public void setPinMustHave6DigitsMsg(String pinMustHave6DigitsMsg) {
		this.pinMustHave6DigitsMsg = pinMustHave6DigitsMsg;
	}

	public String getTelephoneCannotEmptyMsg() {
		return telephoneCannotEmptyMsg;
	}

	public void setTelephoneCannotEmptyMsg(String telephoneCannotEmptyMsg) {
		this.telephoneCannotEmptyMsg = telephoneCannotEmptyMsg;
	}

	public String getEmailCannotEmptyMsg() {
		return emailCannotEmptyMsg;
	}

	public void setEmailCannotEmptyMsg(String emailCannotEmptyMsg) {
		this.emailCannotEmptyMsg = emailCannotEmptyMsg;
	}

	public String getEmailIncorrectFormatMsg() {
		return emailIncorrectFormatMsg;
	}

	public void setEmailIncorrectFormatMsg(String emailIncorrectFormatMsg) {
		this.emailIncorrectFormatMsg = emailIncorrectFormatMsg;
	}

}
