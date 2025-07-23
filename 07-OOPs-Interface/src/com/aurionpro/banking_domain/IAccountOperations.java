package com.aurionpro.banking_domain;

public interface IAccountOperations {
     void deposit(Double amount);
     void withdraw(Double amount);
     void checkBalance();
}
