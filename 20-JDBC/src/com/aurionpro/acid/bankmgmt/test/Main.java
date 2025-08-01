package com.aurionpro.acid.bankmgmt.test;

import java.sql.*;
import java.util.Scanner;

import com.aurionpro.acid.bankmgmt.service.input.menu.BankMenuService;
import com.aurionpro.acid.bankmgmt.service.input.menu.LoginInputService;
import com.aurionpro.acid.bankmgmt.service.model.BankService;
import com.aurionpro.acid.bankmgmt.service.model.SqlConnectionService;

public class Main {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		
		//BankMenuService bankMenuHandler = new BankMenuService(new BankService(new SqlConnectionService().getSqlConncetion()));
		//bankMenuHandler.startMenuLoop();
		
		LoginInputService.handleLoginFlow(new SqlConnectionService().getSqlConncetion() , sc);
	}
}
