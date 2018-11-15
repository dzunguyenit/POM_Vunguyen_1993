package ObjectPageJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewCustomer {

	@SerializedName("nummericValueName")
	@Expose
	private String nummericValueName;
	@SerializedName("specialCharacterName")
	@Expose
	private String specialCharacterName;
	@SerializedName("nummericValueCity")
	@Expose
	private String nummericValueCity;
	@SerializedName("specialCharacterCity")
	@Expose
	private String specialCharacterCity;
	@SerializedName("nummericValueState")
	@Expose
	private String nummericValueState;
	@SerializedName("specialCharacterState")
	@Expose
	private String specialCharacterState;
	@SerializedName("CharValueState")
	@Expose
	private String charValueState;
	@SerializedName("digit")
	@Expose
	private String digit;
	@SerializedName("specialCharacterPin")
	@Expose
	private String specialCharacterPin;
	@SerializedName("pinBlankSpace")
	@Expose
	private String pinBlankSpace;
	@SerializedName("specialCharacterTelephone")
	@Expose
	private String specialCharacterTelephone;
	@SerializedName("telephoneBlankSpace")
	@Expose
	private String telephoneBlankSpace;
	@SerializedName("incorrectEmail")
	@Expose
	private String incorrectEmail;
	@SerializedName("nameCannotEmptyMsg")
	@Expose
	private String nameCannotEmptyMsg;
	@SerializedName("cannotBeNumbericMsg")
	@Expose
	private String cannotBeNumbericMsg;
	@SerializedName("cannotSpecialCharacterMsg")
	@Expose
	private String cannotSpecialCharacterMsg;
	@SerializedName("firstCharacterBlankSpaceMsg")
	@Expose
	private String firstCharacterBlankSpaceMsg;
	@SerializedName("mustBeNumbericMsg")
	@Expose
	private String mustBeNumbericMsg;
	@SerializedName("namemustBeNumbericMsg")
	@Expose
	private String namemustBeNumbericMsg;
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

	public String getNummericValueName() {
		return nummericValueName;
	}

	public void setNummericValueName(String nummericValueName) {
		this.nummericValueName = nummericValueName;
	}

	public String getSpecialCharacterName() {
		return specialCharacterName;
	}

	public void setSpecialCharacterName(String specialCharacterName) {
		this.specialCharacterName = specialCharacterName;
	}

	public String getNummericValueCity() {
		return nummericValueCity;
	}

	public void setNummericValueCity(String nummericValueCity) {
		this.nummericValueCity = nummericValueCity;
	}

	public String getSpecialCharacterCity() {
		return specialCharacterCity;
	}

	public void setSpecialCharacterCity(String specialCharacterCity) {
		this.specialCharacterCity = specialCharacterCity;
	}

	public String getNummericValueState() {
		return nummericValueState;
	}

	public void setNummericValueState(String nummericValueState) {
		this.nummericValueState = nummericValueState;
	}

	public String getSpecialCharacterState() {
		return specialCharacterState;
	}

	public void setSpecialCharacterState(String specialCharacterState) {
		this.specialCharacterState = specialCharacterState;
	}

	public String getCharValueState() {
		return charValueState;
	}

	public void setCharValueState(String charValueState) {
		this.charValueState = charValueState;
	}

	public String getDigit() {
		return digit;
	}

	public void setDigit(String digit) {
		this.digit = digit;
	}

	public String getSpecialCharacterPin() {
		return specialCharacterPin;
	}

	public void setSpecialCharacterPin(String specialCharacterPin) {
		this.specialCharacterPin = specialCharacterPin;
	}

	public String getPinBlankSpace() {
		return pinBlankSpace;
	}

	public void setPinBlankSpace(String pinBlankSpace) {
		this.pinBlankSpace = pinBlankSpace;
	}

	public String getSpecialCharacterTelephone() {
		return specialCharacterTelephone;
	}

	public void setSpecialCharacterTelephone(String specialCharacterTelephone) {
		this.specialCharacterTelephone = specialCharacterTelephone;
	}

	public String getTelephoneBlankSpace() {
		return telephoneBlankSpace;
	}

	public void setTelephoneBlankSpace(String telephoneBlankSpace) {
		this.telephoneBlankSpace = telephoneBlankSpace;
	}

	public String getIncorrectEmail() {
		return incorrectEmail;
	}

	public void setIncorrectEmail(String incorrectEmail) {
		this.incorrectEmail = incorrectEmail;
	}

	public String getNameCannotEmptyMsg() {
		return nameCannotEmptyMsg;
	}

	public void setNameCannotEmptyMsg(String nameCannotEmptyMsg) {
		this.nameCannotEmptyMsg = nameCannotEmptyMsg;
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

	public String getFirstCharacterBlankSpaceMsg() {
		return firstCharacterBlankSpaceMsg;
	}

	public void setFirstCharacterBlankSpaceMsg(String firstCharacterBlankSpaceMsg) {
		this.firstCharacterBlankSpaceMsg = firstCharacterBlankSpaceMsg;
	}

	public String getMustBeNumbericMsg() {
		return mustBeNumbericMsg;
	}

	public void setMustBeNumbericMsg(String mustBeNumbericMsg) {
		this.mustBeNumbericMsg = mustBeNumbericMsg;
	}

	public String getNamemustBeNumbericMsg() {
		return namemustBeNumbericMsg;
	}

	public void setNamemustBeNumbericMsg(String namemustBeNumbericMsg) {
		this.namemustBeNumbericMsg = namemustBeNumbericMsg;
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
