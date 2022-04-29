package com.experion.dto;

import com.experion.enums.UserApproved;

public class UserDto {

	private String userId;
	private String email;
	private String name;
	private String givenName;
	private String jobTitle;
	private String extensionRole;
	private String familyName;
	private String city;
	private String country;
	private String state;
	private String streetAddress;
	private String postalCode;
	private UserApproved isApproved;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getExtensionRole() {
		return extensionRole;
	}

	public void setExtensionRole(String extensionRole) {
		this.extensionRole = extensionRole;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamily_name(String familyName) {
		this.familyName = familyName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public UserApproved getIsApproved() {
		return isApproved;
	}

	public void setIsApproved(UserApproved isApproved) {
		this.isApproved = isApproved;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", email=" + email + ", name=" + name + ", givenName=" + givenName
				+ ", jobTitle=" + jobTitle + ", extensionRole=" + extensionRole + ", familyName=" + familyName
				+ ", city=" + city + ", country=" + country + ", state=" + state + ", streetAddress=" + streetAddress
				+ ", postalCode=" + postalCode + ", isApproved=" + isApproved + "]";
	}

	public UserDto(String userId, String email, String name, String givenName, String jobTitle, String extensionRole,
			String familyName, String city, String country, String state, String streetAddress, String postalCode) {
		this.userId = userId;
		this.email = email;
		this.name = name;
		this.givenName = givenName;
		this.jobTitle = jobTitle;
		this.extensionRole = extensionRole;
		this.familyName = familyName;
		this.city = city;
		this.country = country;
		this.state = state;
		this.streetAddress = streetAddress;
		this.postalCode = postalCode;
		this.isApproved = UserApproved.NOT_APPROVED;
	}

	public UserDto() {
	}

}
