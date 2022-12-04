package com.gl.main;
import java.util.Scanner;
import com.gl.model.Employee;
import com.gl.interfaces.Credentials;
import com.gl.service.CredentialService;
import com.gl.model.Employee;

public class DriverClass {
	public static void main(String[] args) {
		
		Employee emp = new Employee("Harshit","Choudary");
		Credentials cs = new CredentialService();
		
		System.out.println("Please Enter the department from the following.");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.err.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		String generatedEmail = null;
		String generatedPassword = null;
		switch(option) {
			case 1:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"tech");
				generatedPassword = cs.generatePassword();
				break;
			}
			case 2:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"admin");
				generatedPassword = cs.generatePassword();
				break;			
			}
			case 3:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"hr");
				generatedPassword = cs.generatePassword();
				break;			
			}
			case 4:{
				generatedEmail = cs.generateEmailAddress(emp.getFirstName().toLowerCase(),emp.getLastName().toLowerCase(),"lg");
				generatedPassword = cs.generatePassword();
			}
			default:{
				System.out.println("Enter valid option.");
			}
		}
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		cs.showCredentials(emp);
	}
}
