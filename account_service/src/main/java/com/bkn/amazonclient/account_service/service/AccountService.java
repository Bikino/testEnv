package com.bkn.amazonclient.account_service.service;

import com.bkn.amazonclient.account_service.model.Account;

import java.util.List;

public interface AccountService {
    List<Account> getAllAccounts();
    Account saveAccount(Account account);
    Account findAccountById(String id);
    void deleteAccountById(String id);
    Account updateAccount(Account account);
}
