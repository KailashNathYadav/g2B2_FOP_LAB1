package com.gl.interfaces;
import com.gl.model.Employee;

public interface Credentials {
	public String generateEmailAddress(String firstName,String lastName,String department);
	public String generatePassword();
	public void showCredentials(Employee emp);
}
