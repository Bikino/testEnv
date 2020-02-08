package com.bkn.amazonclient.account_service.controller;

import com.bkn.amazonclient.account_service.model.Account;
import com.bkn.amazonclient.account_service.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountRestController {

    private AccountRepository accountRepository;

    public AccountRestController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/all")
    public List<Account> getAll(){
        return accountRepository.findAll();
    }

    @PostMapping("/save")
    public Account saveAccount(@RequestBody Account account){
        return accountRepository.save(account);
    }
}
