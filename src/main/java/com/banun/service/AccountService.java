package com.banun.service;

import java.security.Principal;

import com.banun.domain.PrimaryAccount;
import com.banun.domain.PrimaryTransaction;
import com.banun.domain.SavingsAccount;
import com.banun.domain.SavingsTransaction;

public interface AccountService {
	PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);
    
    
}
