package com.banun.dao;

import com.banun.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Anas Banun on 10/21/16.
 */
public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {

    PrimaryAccount findByAccountNumber (int accountNumber);
}
