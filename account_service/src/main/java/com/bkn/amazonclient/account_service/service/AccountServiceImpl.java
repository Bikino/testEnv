package com.bkn.amazonclient.account_service.service;

import com.bkn.amazonclient.account_service.model.Account;
import com.bkn.amazonclient.account_service.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository repository;

    @Autowired
    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Account> getAllAccounts() {
        return repository.findAll();
    }

    @Override
    public Account saveAccount(Account account) {
        return null;
    }

    @Override
    public Account findAccountById(String id) {
        return null;
    }

    @Override
    public void deleteAccountById(String id) {

    }

    @Override
    public Account updateAccount(Account account) {
        return null;
    }
}
