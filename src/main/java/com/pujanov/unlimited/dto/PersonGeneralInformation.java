/**
 * 
 */
package com.pujanov.unlimited.dto;

/**
 * @author Pujan K.C. <pujanov69@gmail.com>
 *
 * Created on Dec 26, 2019
 */
public class PersonGeneralInformation {

	private String firstName;
	private String middleInitial;
	private String lastName;
	private String email;
	private String email2;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	@Override
	public String toString() {
		return "PersonGeneralInformation [firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName="
				+ lastName + ", email=" + email + ", email2=" + email2 + "]";
	}
	
	
}
