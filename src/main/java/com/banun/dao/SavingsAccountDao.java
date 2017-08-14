package com.banun.dao;

import com.banun.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anas Banun on 10/21/16.
 */
public interface SavingsAccountDao extends CrudRepository<SavingsAccount, Long> {

    SavingsAccount findByAccountNumber (int accountNumber);
}
