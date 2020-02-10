package com.bkn.amazonclient.account_service;


import com.bkn.amazonclient.account_service.controller.AccountRestController;
import com.bkn.amazonclient.account_service.model.Account;
import com.bkn.amazonclient.account_service.service.AccountService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.HttpStatus;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class AccountRestControllerTest {

    @InjectMocks
    AccountRestController controller;

    @Mock
    AccountService service;

    @Mock
    Account account;



    private static final String ID = "aaa";

    @Test
    public void getAccountByIdTest(){
        Mockito.when(service.findAccountById(ID)).thenReturn(account);
        Assertions.assertEquals(controller.getAccountById(ID).getBody(),account);
    }

    @Test
    public void getAllTest(){
        List<Account> accounts = new ArrayList<>();
        accounts.add(account);
        Mockito.when(service.getAllAccounts()).thenReturn(accounts);
        Assertions.assertEquals(controller.getAll().getBody().size(),accounts.size());
    }

    @Test
    public void  saveAccountTest(){
        Assertions.assertEquals(controller.saveAccount(account).getStatusCode(), HttpStatus.OK);
    }

}
