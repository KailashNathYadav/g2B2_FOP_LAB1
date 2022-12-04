package com.gl.service;
import java.util.Random;
import com.gl.interfaces.Credentials;
import com.gl.model.Employee;
import com.gl.main.DriverClass;

public class CredentialService implements Credentials{
	@Override
	public String generatePassword() {
		String capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = capitals.toLowerCase();
		String numbers = "01234567890";
		String specialCharacters = "!@#$%&*~-";
		String values = capitals + lower + numbers + specialCharacters;
		String password = "";
		Random random = new Random();
		for(int i = 0; i < 8; i ++) {
			password += String.valueOf(values.charAt(random.nextInt(values.length())));
		}
		return password;
	}
	
	@Override
	public String generateEmailAddress(String firstName,String lastName,String department) {
		return firstName + lastName + "@" + department + ".gl.in";
	}
	
	@Override
	public void showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email\t---> " + employee.getEmail());
		System.out.println("Password\t---> " + employee.getPassword());
	}
}
