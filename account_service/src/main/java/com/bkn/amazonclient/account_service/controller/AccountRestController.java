package com.bkn.amazonclient.account_service.controller;

import com.bkn.amazonclient.account_service.model.Account;
import com.bkn.amazonclient.account_service.repository.AccountRepository;
import com.bkn.amazonclient.account_service.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountRestController {

    private AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAll(){
        return new ResponseEntity<List<Account>>(accountService.getAllAccounts(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Account> saveAccount(@RequestBody Account account){
        return new ResponseEntity<Account>(accountService.saveAccount(account),HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable String id){

        return new ResponseEntity<>(accountService.findAccountById(id),HttpStatus.OK);

    }
}
