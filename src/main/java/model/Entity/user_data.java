package model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user_data {
	@Id
	public int userId;
	@Column(name="Password", nullable=false)
	public String password;
	@Column(name="User_Name", nullable=false)
	public String userName;
	@Column(name="Age")
	public int userAge;
	@Column(name="Email_Address", nullable=false)
	public String userEmail;
	@Column(name="Contact_Number", nullable=false)
	public String userContact;
	@Column(name="Address")
	public String userAddress;
	@Column(name="PIN_Code")
	public String areaPincode;
	@Column(name="Gender", nullable=false)
	public String gender;
	
	public user_data(int userId, String password, String userName, int userAge, String userEmail, String userContact,
			String userAddress, String areaPincode, String gender) {
		super();
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userAddress = userAddress;
		this.areaPincode = areaPincode;
		this.gender = gender;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getAreaPincode() {
		return areaPincode;
	}
	public void setAreaPincode(String areaPincode) {
		this.areaPincode = areaPincode;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

}
