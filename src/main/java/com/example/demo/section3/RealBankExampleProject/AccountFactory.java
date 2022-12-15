package com.example.demo.section3.RealBankExampleProject;

public interface AccountFactory {
    public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}
