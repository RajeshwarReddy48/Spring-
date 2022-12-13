package com.spring.core.assignment1;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
