package com.aurionpro.acid.bankmgmt.service.input.customer;

import java.sql.Connection;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.dao.UserDao;

public class ResetPassword {
      
	public static void resetPasswordFlow(Connection connection, int accountId) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.print(" Enter your current password: ");
	    String oldPassword = scanner.nextLine().trim();

	    if (!UserDao.verifyUserPassword(connection, accountId, oldPassword)) {
	        System.out.println(" Incorrect old password. Aborting password reset.");
	        return;
	    }

	    String newPassword = getNewPasswordFromUser();

	    UserDao.updatePassword(connection, accountId, newPassword);;
	}

	
	public static String getNewPasswordFromUser() {
	    Scanner scanner = new Scanner(System.in);
	    while (true) {
	        System.out.print(" Enter new password: ");
	        String newPassword = scanner.nextLine().trim();
	        if (newPassword.isEmpty()) {
	            System.out.println(" Password cannot be empty.");
	            continue;
	        }

	        System.out.print(" Confirm new password: ");
	        String confirmPassword = scanner.nextLine().trim();

	        if (!newPassword.equals(confirmPassword)) {
	            System.out.println(" Passwords do not match. Try again.");
	        } else {
	            return newPassword;
	        }
	    }
	}

}
