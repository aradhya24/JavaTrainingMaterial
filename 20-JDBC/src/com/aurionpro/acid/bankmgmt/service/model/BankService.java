package com.aurionpro.acid.bankmgmt.service.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aurionpro.acid.bankmgmt.dao.AccountDao;
import com.aurionpro.acid.bankmgmt.service.input.menu.InputService;
import com.aurionpro.acid.bankmgmt.service.transactionlogs.TransactionLogger;

public class BankService {

	public Connection connection;

	public BankService(Connection connection) {
		this.connection = connection;
	}

	public void addAccount(Connection connection) throws SQLException {

		InputService.handleAddAccount(connection);
	}

	public void deleteAccount(Connection connection) throws SQLException {

		InputService.handleDeleteAccount(connection);
	}

	public static ResultSet viewAllAccounts(Connection connection) throws SQLException {

		ResultSet rs = AccountDao.viewAllAccountHolders(connection);
		return rs;
	}
	
	public static ResultSet viewAllAccountsTransactionHistory(Connection connection) throws SQLException {

		ResultSet rs = AccountDao.viewAllAccountHoldersTransactionHistory(connection);
		return rs;
	}

	public void transferFund(Connection connection) throws SQLException {
		InputService.handleFundTransfer(connection);
	}

	public void viewAccountBalance(Connection connection) throws SQLException {
		InputService.handleViewBalance(connection);
	}
	
	public void depositFunds(Connection connection) throws SQLException {
		InputService.handleDeposit(connection);
	}

	public void withdrawFunds(Connection connection) throws SQLException {
		InputService.handleWithdraw(connection);
	}


	public void showTransactionHistory(Connection connection) throws SQLException {
		int accountId = InputService.getValidAccountIdTransaction(connection);

	    System.out.println("Transaction history for Account ID: " + accountId);
	    TransactionLogger.showHistoryByAccount(accountId);
	}
}
